const express = require("express");
const path = require("path");

const app = express();
const port = 8080;
const dirname = __dirname + "/..";

//アプリ設定
app.use(express.urlencoded({ extended: true }));
app.use(express.static(path.join(dirname, "client")));

//サーバー処理
app.get("/", (req, res) => {
    res.sendFile(path.join(dirname, "client", "index.html"));
})

app.post("/", (req, res) => {
    const { name, message } = req.body;

    console.log(name);
    console.log(message);

    res.sendFile(path.join(dirname, "client", "index.html"));
});

//Server Run
app.listen(port, () => {
    console.log("Server is running");
})