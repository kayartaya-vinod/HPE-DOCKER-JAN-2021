const express = require('express');
const process = require('process');
const app = express();

const port = process.env.APP_PORT || 7070;
app.get('/', (req, resp)=>{
    resp.end("Hello, world!");
});

app.get('/api/author', (req, resp)=>{
    resp.json({
        name: "Vinod",
        city: "Bangalore",
        email: "vinod@vinod.co",
        phone: "9731424784",
        website: "https://vinod.co",
        country: "India"
    });
});

app.listen(port, ()=>{
    console.log(`server started at port ${port}`);
});