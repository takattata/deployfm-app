package com.takasy.deployfm.parser

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import java.io.InputStream
import java.io.InputStreamReader

@RunWith(AndroidJUnit4::class)
class DeployFmParserTest {
    @Test
    fun testParse() {
        val inputStream = testData.byteInputStream()
        val titles : List<String> = DeployFmParser().parse(inputStream)
        assertThat(titles.count()).isEqualTo(3)
        assertThat(titles.first()).isEqualTo("11. itoshoさん")
//        assertThat(titles.first()).isEqualTo("おまけ 10. 主にレトロゲームなどの話")
    }
}

val testData = """
<?xml version="1.0" encoding="UTF-8"?>
<rss version="2.0" xmlns:atom="http://www.w3.org/2005/Atom" xmlns:itunes="http://www.itunes.com/dtds/podcast-1.0.dtd" xmlns:media="http://search.yahoo.com/mrss/" xml:lang="ja">
  <channel>
    <atom:link href="https://takattata.github.io/deployfm/feed.xml" rel="self" type="application/rss+xml" />
    <link>https://takattata.github.io/deployfm/</link>
    <title>deploy.fm</title>
    <description>知り合ったソフトウェアエンジニアたちの今までやこれからを聞いていくpodcast</description>
    <media:keywords>deployfm</media:keywords>
    <media:category scheme="http://www.itunes.com/dtds/podcast-1.0.dtd">Technology</media:category>
    <language>ja</language>
    <itunes:subtitle>知り合ったソフトウェアエンジニアたちの今までやこれからを聞いていくpodcast</itunes:subtitle>
    <itunes:author>takasy</itunes:author>
    <itunes:summary>知り合ったソフトウェアエンジニアたちの今までやこれからを聞いていくpodcast</itunes:summary>
    <itunes:keywords>deployfm</itunes:keywords>
    <itunes:owner>
      <itunes:name>takasy</itunes:name>
      <itunes:email></itunes:email>
    </itunes:owner>
    <itunes:image href="https://takattata.github.io/deployfm/images/artwork.jpg" />
    <itunes:category text="Technology"/>
    <itunes:explicit>no</itunes:explicit>

      <item>
        <title>11. itoshoさん</title>
        <link>https://takattata.github.io/deployfm/episode/11-main</link>
        <pubDate>Tue, 11 Dec 2018 15:50:00 +0900</pubDate>
        <description>&lt;h2 id=&quot;show-notes&quot;&gt;Show Notes&lt;/h2&gt;
&lt;ul&gt;
  &lt;li&gt;自己紹介&lt;/li&gt;
  &lt;li&gt;エンジニアになるきっかけ
    &lt;ul&gt;
      &lt;li&gt;Flash&lt;/li&gt;
      &lt;li&gt;1社目に至るまで
        &lt;ul&gt;
          &lt;li&gt;総合政策学部&lt;/li&gt;
          &lt;li&gt;印象深い活動&lt;/li&gt;
        &lt;/ul&gt;
      &lt;/li&gt;
    &lt;/ul&gt;
  &lt;/li&gt;
  &lt;li&gt;1社目: 金融系のSIer
    &lt;ul&gt;
      &lt;li&gt;1年半&lt;/li&gt;
      &lt;li&gt;全貌が見えない&lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;https://twitter.com/call_me_nots/status/1071962736915972097&quot;&gt;みずほ銀行ATMのツイート&lt;/a&gt;&lt;/li&gt;
      &lt;li&gt;コードが書きたい&lt;/li&gt;
      &lt;li&gt;転職活動&lt;/li&gt;
    &lt;/ul&gt;
  &lt;/li&gt;
  &lt;li&gt;2社目: 受託のWeb系
    &lt;ul&gt;
      &lt;li&gt;5年半&lt;/li&gt;
      &lt;li&gt;北海道への出張&lt;/li&gt;
      &lt;li&gt;10くらいのプロダクト&lt;/li&gt;
      &lt;li&gt;基本はサーバー&lt;/li&gt;
      &lt;li&gt;個人でSwift使ってアプリ開発&lt;/li&gt;
      &lt;li&gt;自社サービス作る面白さ&lt;/li&gt;
    &lt;/ul&gt;
  &lt;/li&gt;
  &lt;li&gt;3社目: &lt;a href=&quot;https://supership.jp/&quot;&gt;Supership&lt;/a&gt;
    &lt;ul&gt;
      &lt;li&gt;nanapi + Bitceller + Scaleout&lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;https://twitter.com/kensuu&quot;&gt;けんすうさん&lt;/a&gt;&lt;/li&gt;
      &lt;li&gt;大体が自社、一部がconnehitoに出向&lt;/li&gt;
      &lt;li&gt;Go&lt;/li&gt;
    &lt;/ul&gt;
  &lt;/li&gt;
  &lt;li&gt;&lt;a href=&quot;http://stemcrown.hatenablog.jp/entry/2016/10/20/190500&quot;&gt;アンサー&lt;/a&gt;というプロダクト
    &lt;ul&gt;
      &lt;li&gt;コミュニティサービス(クローズしている)&lt;/li&gt;
      &lt;li&gt;人のコミュニケーションを見てるのが好き&lt;/li&gt;
    &lt;/ul&gt;
  &lt;/li&gt;
  &lt;li&gt;大学入ったきっかけ&lt;/li&gt;
  &lt;li&gt;伝えたいこと
    &lt;ul&gt;
      &lt;li&gt;「新卒で入る会社が全てではないよ。途中からやり直しもきくし。」&lt;/li&gt;
    &lt;/ul&gt;
  &lt;/li&gt;
  &lt;li&gt;最近読んだオススメの本とか
    &lt;ul&gt;
      &lt;li&gt;月に1, 2冊くらい読む&lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;http://amzn.asia/d/eoCMuIj&quot;&gt;NETFLIXの最強人事戦略～自由と責任の文化を築く～&lt;/a&gt;&lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;http://amzn.asia/d/3EAuliq&quot;&gt;How Google Works&lt;/a&gt;
        &lt;ul&gt;
          &lt;li&gt;&lt;a href=&quot;https://www.businessinsider.jp/post-175626&quot;&gt;Googleの内情マンガ&lt;/a&gt;&lt;/li&gt;
        &lt;/ul&gt;
      &lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;http://amzn.asia/d/dQxr85P&quot;&gt;レスポンシブル・カンパニー&lt;/a&gt;&lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;https://www.pospome.work/entry/2018/10/10/130956&quot;&gt;pospomeのサーバーサイドアーキテクチャ&lt;/a&gt;&lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;https://www.oreilly.co.jp/books/9784873116860/&quot;&gt;Web API: The Good Parts&lt;/a&gt;&lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;http://amzn.asia/d/fFfRXFL&quot;&gt;仕事で「一皮むける」&lt;/a&gt;&lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;http://amzn.asia/d/dg8VwtK&quot;&gt;日本の思想(であることとすることがたしか載ってる本)&lt;/a&gt;&lt;/li&gt;
      &lt;li&gt;習慣化するの難しい&lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;http://amzn.asia/d/8aPFXYE&quot;&gt;シリアスゲーム―教育・社会に役立つデジタルゲーム&lt;/a&gt;&lt;/li&gt;
    &lt;/ul&gt;
  &lt;/li&gt;
  &lt;li&gt;最近学びたいこと
    &lt;ul&gt;
      &lt;li&gt;英語
        &lt;ul&gt;
          &lt;li&gt;&lt;a href=&quot;https://app-flamingo.com/&quot;&gt;flamingo&lt;/a&gt;&lt;/li&gt;
          &lt;li&gt;&lt;a href=&quot;https://www.youtube.com/channel/UCPlreGCqby4Qg9Vuem5scpw&quot;&gt;バイリンガール&lt;/a&gt;&lt;/li&gt;
          &lt;li&gt;&lt;a href=&quot;https://koboblog.net/grammar-in-use-app/&quot;&gt;English Grammar in Use&lt;/a&gt;&lt;/li&gt;
        &lt;/ul&gt;
      &lt;/li&gt;
      &lt;li&gt;iOS
        &lt;ul&gt;
          &lt;li&gt;&lt;a href=&quot;https://itunes.apple.com/jp/developer/sho-ito/id601049516&quot;&gt;itoshoさんの公開しているアプリ&lt;/a&gt;&lt;/li&gt;
        &lt;/ul&gt;
      &lt;/li&gt;
    &lt;/ul&gt;
  &lt;/li&gt;
&lt;/ul&gt;
</description>
        <guid isPermaLink="true">https://takattata.github.io/deployfm/episode/11-main</guid>
        <enclosure url="https://takattata.github.io/deployfm/audio/11_main.mp3" length="51145841" type="audio/mp3"/>
        <itunes:author>takasy</itunes:author>
        <itunes:subtitle>itoshoさんのエンジニアになった経緯や今までやられてきた仕事の話、最近読んだ本などの話をお聞きしました</itunes:subtitle>
        <itunes:duration>72:22</itunes:duration>
        <itunes:explicit>no</itunes:explicit>
        <media:thumbnail url="https://takattata.github.io/deployfm/images/artwork.jpg"/>
      </item>

      <item>
        <title>おまけ 10. 主にレトロゲームなどの話</title>
        <link>https://takattata.github.io/deployfm/episode/10-omake</link>
        <pubDate>Thu, 29 Nov 2018 12:00:00 +0900</pubDate>
        <description>&lt;h2 id=&quot;show-notes&quot;&gt;Show Notes&lt;/h2&gt;
&lt;ul&gt;
  &lt;li&gt;deploy.fmを知ったきっかけ
    &lt;ul&gt;
      &lt;li&gt;&lt;a href=&quot;https://deploy.am/&quot;&gt;deploy.am&lt;/a&gt;&lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;https://www.oshigotoam.com/&quot;&gt;おしごとam&lt;/a&gt;&lt;/li&gt;
    &lt;/ul&gt;
  &lt;/li&gt;
  &lt;li&gt;ノッチの対応って大変そう&lt;/li&gt;
  &lt;li&gt;ゲーム雑談&lt;/li&gt;
  &lt;li&gt;半田ごて
    &lt;ul&gt;
      &lt;li&gt;&lt;a href=&quot;http://assemblage.tokyo/&quot;&gt;Assemblage&lt;/a&gt;&lt;/li&gt;
    &lt;/ul&gt;
  &lt;/li&gt;
  &lt;li&gt;アニメとか
    &lt;ul&gt;
      &lt;li&gt;&lt;a href=&quot;https://dic.pixiv.net/a/%E7%A5%9E%E5%85%AB%E5%89%A3%E4%BC%9D&quot;&gt;神八犬伝&lt;/a&gt;&lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;http://www.thunderboltfantasy.com/season1/&quot;&gt;Thunderbolt Fantasy 東離劍遊紀&lt;/a&gt;&lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;https://aquaplus.jp/th2/&quot;&gt;ToHeart2&lt;/a&gt;&lt;/li&gt;
    &lt;/ul&gt;
  &lt;/li&gt;
  &lt;li&gt;レトロゲーム
    &lt;ul&gt;
      &lt;li&gt;&lt;a href=&quot;https://ja.wikipedia.org/wiki/FLAPPY&quot;&gt;フラッピー&lt;/a&gt;
        &lt;ul&gt;
          &lt;li&gt;&lt;a href=&quot;https://ja.wikipedia.org/wiki/%E3%83%87%E3%83%BC%E3%82%BF%E3%82%A4%E3%83%BC%E3%82%B9%E3%83%88&quot;&gt;データイースト&lt;/a&gt;&lt;/li&gt;
        &lt;/ul&gt;
      &lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;https://ja.wikipedia.org/wiki/%E3%83%9C%E3%82%B3%E3%82%B9%E3%82%AB%E3%82%A6%E3%82%A9%E3%83%BC%E3%82%BA&quot;&gt;ボコスカウォーズ&lt;/a&gt;&lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;https://www26.atwiki.jp/gcmatome/pages/2131.html&quot;&gt;かぐや姫伝説&lt;/a&gt;
        &lt;ul&gt;
          &lt;li&gt;&lt;a href=&quot;https://ja.wikipedia.org/wiki/%E3%83%9E%E3%82%A4%E3%82%AF%E3%83%AD%E3%83%8B%E3%82%AF%E3%82%B9_(%E3%82%B2%E3%83%BC%E3%83%A0%E4%BC%9A%E7%A4%BE)&quot;&gt;マイクロニクス&lt;/a&gt;&lt;/li&gt;
        &lt;/ul&gt;
      &lt;/li&gt;
      &lt;li&gt;ドラゴンクエストシリーズ
        &lt;ul&gt;
          &lt;li&gt;&lt;a href=&quot;https://dic.pixiv.net/a/%E3%83%89%E3%83%A9%E3%82%B4%E3%83%B3%E3%82%AF%E3%82%A8%E3%82%B9%E3%83%88%E2%85%A3&quot;&gt;ドラゴンクエスト4&lt;/a&gt;&lt;/li&gt;
          &lt;li&gt;&lt;a href=&quot;https://dic.pixiv.net/a/%E3%83%89%E3%83%A9%E3%82%B4%E3%83%B3%E3%82%AF%E3%82%A8%E3%82%B9%E3%83%88%E2%85%A1&quot;&gt;ドラゴンクエスト2&lt;/a&gt;&lt;/li&gt;
        &lt;/ul&gt;
      &lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;https://ja.wikipedia.org/wiki/%E3%82%A2%E3%83%A9%E3%83%93%E3%82%A2%E3%83%B3%E3%83%89%E3%83%AA%E3%83%BC%E3%83%A0_%E3%82%B7%E3%82%A7%E3%83%A9%E3%82%B6%E3%83%BC%E3%83%89&quot;&gt;アラビアンドリームシェラザード&lt;/a&gt;
        &lt;ul&gt;
          &lt;li&gt;&lt;a href=&quot;https://dic.nicovideo.jp/a/%E9%A3%9B%E9%BE%8D%E3%81%AE%E6%8B%B3&quot;&gt;飛竜の拳&lt;/a&gt;&lt;/li&gt;
        &lt;/ul&gt;
      &lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;https://www.nintendo.co.jp/clvs/&quot;&gt;ニンテンドークラシックミニ スーパーファミコン&lt;/a&gt;
        &lt;ul&gt;
          &lt;li&gt;※マザー2の英名はEarthBoundです&lt;/li&gt;
        &lt;/ul&gt;
      &lt;/li&gt;
      &lt;li&gt;Y’sシリーズ
        &lt;ul&gt;
          &lt;li&gt;&lt;a href=&quot;https://www.falcom.co.jp/ys12_psp/&quot;&gt;イースI＆IIクロニクルズ&lt;/a&gt;&lt;/li&gt;
          &lt;li&gt;PCエンジンCD-ROM2やりたい&lt;/li&gt;
          &lt;li&gt;&lt;a href=&quot;http://amzn.asia/d/iFtBvrZ&quot;&gt;イース―失われた王国&lt;/a&gt;&lt;/li&gt;
        &lt;/ul&gt;
      &lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;https://ja.wikipedia.org/wiki/%E3%83%95%E3%82%A1%E3%83%9F%E3%82%B3%E3%83%B3%E6%8E%A2%E5%81%B5%E5%80%B6%E6%A5%BD%E9%83%A8&quot;&gt;ファミコン探偵倶楽部&lt;/a&gt;&lt;/li&gt;
      &lt;li&gt;ファイナルファンタジーシリーズ
        &lt;ul&gt;
          &lt;li&gt;&lt;a href=&quot;https://ja.wikipedia.org/wiki/%E3%83%95%E3%82%A1%E3%82%A4%E3%83%8A%E3%83%AB%E3%83%95%E3%82%A1%E3%83%B3%E3%82%BF%E3%82%B8%E3%83%BCV&quot;&gt;FF V&lt;/a&gt;&lt;/li&gt;
          &lt;li&gt;&lt;a href=&quot;https://ja.wikipedia.org/wiki/%E3%83%95%E3%82%A1%E3%82%A4%E3%83%8A%E3%83%AB%E3%83%95%E3%82%A1%E3%83%B3%E3%82%BF%E3%82%B8%E3%83%BCVI&quot;&gt;FF VI&lt;/a&gt;&lt;/li&gt;
        &lt;/ul&gt;
      &lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;https://ja.wikipedia.org/wiki/%E3%81%8B%E3%81%BE%E3%81%84%E3%81%9F%E3%81%A1%E3%81%AE%E5%A4%9C&quot;&gt;かまいたちの夜&lt;/a&gt;&lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;https://www.konami.com/games/tokimeki/&quot;&gt;ときめきメモリアル&lt;/a&gt;
        &lt;ul&gt;
          &lt;li&gt;机の上に置かれた事件&lt;/li&gt;
        &lt;/ul&gt;
      &lt;/li&gt;
      &lt;li&gt;テイルズシリーズ 1
        &lt;ul&gt;
          &lt;li&gt;&lt;a href=&quot;https://dic.nicovideo.jp/a/%E3%83%86%E3%82%A4%E3%83%AB%E3%82%BA%E3%82%AA%E3%83%96%E3%83%95%E3%82%A1%E3%83%B3%E3%82%BF%E3%82%B8%E3%82%A2&quot;&gt;テイルズオブファンタジア&lt;/a&gt;&lt;/li&gt;
          &lt;li&gt;&lt;a href=&quot;https://dic.pixiv.net/a/%E3%83%86%E3%82%A4%E3%83%AB%E3%82%BA%E3%82%AA%E3%83%96%E3%83%99%E3%83%AB%E3%82%BB%E3%83%AA%E3%82%A2&quot;&gt;テイルズオブベルセリア&lt;/a&gt;&lt;/li&gt;
          &lt;li&gt;&lt;a href=&quot;https://dic.pixiv.net/a/%E3%83%86%E3%82%A4%E3%83%AB%E3%82%BA%E3%82%AA%E3%83%96%E3%82%B0%E3%83%AC%E3%82%A4%E3%82%BB%E3%82%B9f&quot;&gt;テイルズオブグレイセスf&lt;/a&gt;&lt;/li&gt;
          &lt;li&gt;おっさん枠&lt;/li&gt;
          &lt;li&gt;&lt;a href=&quot;https://dic.pixiv.net/a/%E3%83%86%E3%82%A4%E3%83%AB%E3%82%BA%E3%82%AA%E3%83%96%E3%82%B8%E3%82%A2%E3%83%93%E3%82%B9&quot;&gt;テイルズオブジアビス&lt;/a&gt;&lt;/li&gt;
          &lt;li&gt;&lt;a href=&quot;https://dic.pixiv.net/a/%E3%83%86%E3%82%A4%E3%83%AB%E3%82%BA%E3%82%AA%E3%83%96%E3%83%87%E3%82%B9%E3%83%86%E3%82%A3%E3%83%8B%E3%83%BC2&quot;&gt;テイルズオブデスティニー2&lt;/a&gt;&lt;/li&gt;
        &lt;/ul&gt;
      &lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;http://www.dragonquest.jp/dq8/&quot;&gt;ドラゴンクエスト8&lt;/a&gt;&lt;/li&gt;
      &lt;li&gt;テイルズシリーズ 2
        &lt;ul&gt;
          &lt;li&gt;&lt;a href=&quot;https://dic.pixiv.net/a/%E3%83%86%E3%82%A4%E3%83%AB%E3%82%BA%E3%82%AA%E3%83%96%E3%82%A8%E3%82%BF%E3%83%BC%E3%83%8B%E3%82%A2&quot;&gt;テイルズオブエターニア&lt;/a&gt;&lt;/li&gt;
          &lt;li&gt;&lt;a href=&quot;https://dic.pixiv.net/a/%E3%83%86%E3%82%A4%E3%83%AB%E3%82%BA%E3%82%AA%E3%83%96%E3%83%AC%E3%82%B8%E3%82%A7%E3%83%B3%E3%83%87%E3%82%A3%E3%82%A2&quot;&gt;テイルズオブレジェンディア&lt;/a&gt;&lt;/li&gt;
        &lt;/ul&gt;
      &lt;/li&gt;
    &lt;/ul&gt;
  &lt;/li&gt;
&lt;/ul&gt;
</description>
        <guid isPermaLink="true">https://takattata.github.io/deployfm/episode/10-omake</guid>
        <enclosure url="https://takattata.github.io/deployfm/audio/10_omake.mp3" length="64064866" type="audio/mp3"/>
        <itunes:author>takasy</itunes:author>
        <itunes:subtitle>MzRyuKaさんと主にゲームの話で盛り上がりました</itunes:subtitle>
        <itunes:duration>90:44</itunes:duration>
        <itunes:explicit>no</itunes:explicit>
        <media:thumbnail url="https://takattata.github.io/deployfm/images/artwork.jpg"/>
      </item>

      <item>
        <title>10. MzRyuKaさん</title>
        <link>https://takattata.github.io/deployfm/episode/10-main</link>
        <pubDate>Tue, 27 Nov 2018 10:37:00 +0900</pubDate>
        <description>&lt;h2 id=&quot;show-notes&quot;&gt;Show Notes&lt;/h2&gt;
&lt;ul&gt;
  &lt;li&gt;deploy.fmの感想ツイートへの感謝&lt;/li&gt;
  &lt;li&gt;自己紹介
    &lt;ul&gt;
      &lt;li&gt;中小SIer&lt;/li&gt;
    &lt;/ul&gt;
  &lt;/li&gt;
  &lt;li&gt;エンジニアになるまで
    &lt;ul&gt;
      &lt;li&gt;ゲームを作ろうとしてみたが…&lt;/li&gt;
      &lt;li&gt;情報系の大学: 人体検知センサー&lt;/li&gt;
      &lt;li&gt;北海道での仕事&lt;/li&gt;
      &lt;li&gt;東京に移動&lt;/li&gt;
    &lt;/ul&gt;
  &lt;/li&gt;
  &lt;li&gt;経験してきた仕事 1
    &lt;ul&gt;
      &lt;li&gt;PL/SQL&lt;/li&gt;
      &lt;li&gt;VB&lt;/li&gt;
      &lt;li&gt;C言語&lt;/li&gt;
      &lt;li&gt;コードジェネレーターを作る&lt;/li&gt;
      &lt;li&gt;Javaアプリ&lt;/li&gt;
      &lt;li&gt;JavaScriptを無効化する時代があった&lt;/li&gt;
      &lt;li&gt;PM&lt;/li&gt;
      &lt;li&gt;中国でオフショア開発&lt;/li&gt;
      &lt;li&gt;工事中の建物での業務&lt;/li&gt;
      &lt;li&gt;夜のラーメンは気をつけよう&lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;https://twitter.com/es_kumagai&quot;&gt;熊谷さん&lt;/a&gt;&lt;/li&gt;
      &lt;li&gt;ネット禁止業務&lt;/li&gt;
      &lt;li&gt;PDA, &lt;a href=&quot;https://ja.wikipedia.org/wiki/%E3%82%B6%E3%82%A6%E3%83%AB%E3%82%B9&quot;&gt;ザウルス&lt;/a&gt;&lt;/li&gt;
    &lt;/ul&gt;
  &lt;/li&gt;
  &lt;li&gt;教育系の小話
    &lt;ul&gt;
      &lt;li&gt;&lt;a href=&quot;https://ja.wikipedia.org/wiki/%E3%82%B7%E3%83%AA%E3%82%A2%E3%82%B9%E3%82%B2%E3%83%BC%E3%83%A0&quot;&gt;シリアスゲーム&lt;/a&gt;&lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;https://coderdojo.jp/&quot;&gt;CoderDojo&lt;/a&gt;&lt;/li&gt;
    &lt;/ul&gt;
  &lt;/li&gt;
  &lt;li&gt;経験してきた仕事 2
    &lt;ul&gt;
      &lt;li&gt;&lt;a href=&quot;https://ja.wikipedia.org/wiki/%E3%81%AA%E3%81%9C%E3%81%AA%E3%81%9C%E5%88%86%E6%9E%90&quot;&gt;なぜなぜ分析&lt;/a&gt;&lt;/li&gt;
      &lt;li&gt;アジャイル開発&lt;/li&gt;
      &lt;li&gt;Bashのみでプログラム(ファイアウォール機器へデータ投入)&lt;/li&gt;
      &lt;li&gt;Excelをキータッチだけで実装していた同期の話&lt;/li&gt;
      &lt;li&gt;SNMPを応答するプログラムを自作
        &lt;ul&gt;
          &lt;li&gt;&lt;a href=&quot;https://www.zabbix.com/jp/&quot;&gt;Zabbix&lt;/a&gt;&lt;/li&gt;
          &lt;li&gt;&lt;a href=&quot;https://www.elastic.co/jp/products/kibana&quot;&gt;Kibana&lt;/a&gt;&lt;/li&gt;
          &lt;li&gt;RRDtool、逆ポーランド表記&lt;/li&gt;
          &lt;li&gt;InfluxDB&lt;/li&gt;
        &lt;/ul&gt;
      &lt;/li&gt;
      &lt;li&gt;&lt;a href=&quot;https://www.secioss.co.jp/%E7%B5%84%E7%B9%94%E3%82%92%E8%B6%85%E3%81%88%E3%81%A6sso%E3%81%8C%E4%BD%BF%E3%81%88%E3%82%8Bshibboleth%EF%BC%88%E3%82%B7%E3%83%9C%E3%83%AC%E3%82%B9%EF%BC%89%E8%AA%8D%E8%A8%BC%E3%81%A8%E3%81%AF/&quot;&gt;Shibboleth&lt;/a&gt;&lt;/li&gt;
      &lt;li&gt;社内勉強会
        &lt;ul&gt;
          &lt;li&gt;&lt;a href=&quot;https://book.mynavi.jp/ec/products/detail/id=92636&quot;&gt;React Native＋Expoではじめるスマホアプリ開発&lt;/a&gt;&lt;/li&gt;
          &lt;li&gt;モブプロ&lt;/li&gt;
        &lt;/ul&gt;
      &lt;/li&gt;
    &lt;/ul&gt;
  &lt;/li&gt;
  &lt;li&gt;これからやってみたいこと
    &lt;ul&gt;
      &lt;li&gt;社外勉強会を開く&lt;/li&gt;
      &lt;li&gt;本出せたら良いな&lt;/li&gt;
      &lt;li&gt;社内向けpodcast&lt;/li&gt;
      &lt;li&gt;GoとかVue.jsとか&lt;/li&gt;
    &lt;/ul&gt;
  &lt;/li&gt;
  &lt;li&gt;おまけ回へ続く(※9割以上ゲーム話)&lt;/li&gt;
&lt;/ul&gt;
</description>
        <guid isPermaLink="true">https://takattata.github.io/deployfm/episode/10-main</guid>
        <enclosure url="https://takattata.github.io/deployfm/audio/10_main.mp3" length="53726749" type="audio/mp3"/>
        <itunes:author>takasy</itunes:author>
        <itunes:subtitle>MzRyuKaさんのエンジニアになった経緯や今までやられてきた仕事の話をお聞きしました</itunes:subtitle>
        <itunes:duration>74:16</itunes:duration>
        <itunes:explicit>no</itunes:explicit>
        <media:thumbnail url="https://takattata.github.io/deployfm/images/artwork.jpg"/>
      </item>
  </channel>
</rss>
"""