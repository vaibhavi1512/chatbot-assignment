package chatbot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chatbot.model.MessageRequest;
import chatbot.model.MessageResponse;
import chatbot.service.ChatService;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @Autowired
    private ChatService chatService;

    @PostMapping
    public MessageResponse receiveMessage(@RequestBody MessageRequest request) {

        System.out.println("Incoming message: " + request.getMessage());

        String reply = chatService.getReply(request.getMessage());

        return new MessageResponse(reply);
    }
}