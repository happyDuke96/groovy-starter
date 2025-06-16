package DSL
import static DSL.DSLBuilder.*


// without DSL language
//def mail = new Email()
//mail.setFrom("from@gmail.com")
//mail.setTo("to@gmail.com")
//mail.setTitle("title of mail")
//
//def body = new EmailBody()
//body.setText("text of letter")
//body.setImages(['image.jpg','image2.png'])


mail {
    from "from@gmail.com"
    to "to@gmail.com"
    title "title of mail"
    body {
        text "text of letter"
        images (["image.jpg","image2.png"])
        image "oneImage.jpg"
    }
}