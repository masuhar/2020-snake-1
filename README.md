# 2020-snake
The snake game 

## 追加方法
1. https://github.com/p2titech/2020-snake を開く
2. ページ右上にある Fork と書かれたボタンを押す
3. (もし聞かれたら)自分のアカウントを選ぶ
4. https://github.com/自分のアカウント/2020-snake が開かれるはず
5. いつものように Eclipse で clone する
6. 定義を追加する
7. いつものように Eclipse で commit & push する
8. https://github.com/自分のアカウント/2020-snake を開く
9. "This branch is X commit ahead of p2titech:main. "のようなメッセージの右に Pull request と書いてあるのでそれをクリックする
10. 出てきた指示に従って完了する

## Tasks
蛇ゲームのために必要となる以下のメソッドを作れ
1. 蛇を現在の進行方向に1升進める
2. 与えられた位置の升目に蛇の体節があるかを判定する (蛇の頭が自分自身の体節に衝突するとゲーム終了)
3. 蛇を画面上に描画する

### 2. 与えられた位置の升目に蛇の体節があるかを判定する (蛇の頭が自分自身の体節に衝突するとゲーム終了)

#### 計算の例
```
 012345
0......
1...**^
2......
3......
```


| X | Y | 体節 |
| - | - | ---- |
| 0 | 0 | 無   |
| 3 | 1 | 有   |

※頭のない任意の位置に対して判定するものとする