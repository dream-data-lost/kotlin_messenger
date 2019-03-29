package com.daou.kotlinmessenger

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_chat_list.*

class ChatListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_list)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        //TODO Entity 생성(방/친구/방목록/친구목록)
        //TODO 채팅 리스트(Recycler View) 만들기
        //TODO fab 버튼에 대화방 생성 기능 넣기
        //TODO 대화방 Activity 만들기
        //TODO 대화 참여자 목록 만들기 --Drawer Layout 사용
        //TODO 대화방 내 친구 초대 기능, 퇴장 기능
        //TODO 첨부파일 보내기 및 저장하기 기능
        //TODO 프로필 사진 저장 및 노출 기능
        //TODO 채팅방 삭제 기능
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_chat_list, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
