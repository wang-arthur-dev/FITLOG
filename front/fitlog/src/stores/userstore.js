// src/stores/userStore.js
import { defineStore } from 'pinia'
import { PostLogin } from '@/api/auth'
import { gptCall } from '@/api/board'


export const useUserStore = defineStore('user', {
  state: () => ({
    userId: sessionStorage.getItem('userId') || null,
    token: sessionStorage.getItem('token') || null,
    answer: null,
    recommendedBoards: null
  }),
  actions: {
    async login(loginForm) {
      try {
        const data = await PostLogin(loginForm)

        // 로그인 성공 시 userId와 token 저장
        this.userId = data.userId
        this.token = data.token

        // 토큰 세션스토리지에도 저장
        
        sessionStorage.setItem('token', data.token)
        sessionStorage.setItem('userId', data.userId)

        
        return true
      } catch (error) {
        console.error('로그인 실패:', error)
        return false
      }
    },
    async gptCall(question) {
      const data = await gptCall(question);
      this.answer = data.answer;
      this.recommendedBoards = data.recommendedBoards;
    },

    setUser(userId, token) {
      this.userId = userId
      this.token = token
    },
    clearUser() {
      this.userId = null
      this.token = null
      sessionStorage.removeItem('token')
      sessionStorage.removeItem('userId')
    }
  }
},)
