const express = require("express");
const path = require("path");
const app = express();
const port = 8080;

const dirname = __dirname + "/..";
let prevMessages = []; //過去のメッセージ

//アプリ設定
app.use(express.urlencoded({ extended: true }));
app.set("view engine", "ejs");
app.set("views", path.join(dirname, "client"));

//サーバー処理
app.get("/", (req, res) => {
    res.render("index", { prevMessages });
})

app.post("/", (req, res) => {
    
    //過去の書き込みの更新
    const { name, message } = req.body;
    prevMessages.push({ name, message });
    res.redirect("/");
});

//Server Run
app.listen(port, () => {
    console.log("Server is running");
})