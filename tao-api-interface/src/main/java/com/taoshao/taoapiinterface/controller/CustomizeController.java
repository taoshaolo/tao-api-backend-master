package com.taoshao.taoapiinterface.controller;


import com.taoshao.taoapiinterface.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 自定义的接口
 *
 * @author taoshao
 */
@RestController
public class CustomizeController {


    /**
     * 获取用户名
     * @param user
     * @param request
     * @return
     */
    @PostMapping("/api/name/user")
    public String getUserNameByPost(@RequestBody User user, HttpServletRequest request) {
        return "POST 你的用户名字是：" + user.getUsername();
    }

    /**
     * 生成随机昵称
     */
    @PostMapping("/api/random/nickname")
    public String generateRandomNickname() {
        String[] adjectives = {
                "优雅", "机智", "冒险", "梦幻", "神秘", "勇敢", "智慧",
                "快乐", "冷静", "阳光", "温柔", "坚定", "好奇", "活泼",
                "独立", "乐观", "深沉", "机智", "敏锐"
        };
        String[] nouns = {
                "猫", "狗", "狐狸", "狼", "熊", "鸟", "鱼", "龙", "兔子",
                "马", "鹿", "虎", "鹰", "蝴蝶", "蜜蜂", "狮子", "鲸鱼",
                "熊猫", "孔雀", "独角兽", "机器人"
        };
        int adjectiveIndex = new Random().nextInt(adjectives.length);
        int nounIndex = new Random().nextInt(nouns.length);
        return "随机昵称：" + adjectives[adjectiveIndex] + nouns[nounIndex];

    }

    /**
     * 问候
     * @param user
     * @return
     */
    @PostMapping("/api/greeting")
    public String personalizedGreeting(@RequestBody User user) {
        LocalDateTime now = LocalDateTime.now();
        String timeOfDay;
        if (now.getHour() < 12) {
            timeOfDay = "早上";
        } else if (now.getHour() < 18) {
            timeOfDay = "下午";
        } else {
            timeOfDay = "晚上";
        }
        return "你好，" + user.getUsername() + "！" + timeOfDay + "好！";
    }

    /**
     * 书籍推荐
     * @param genre
     * @return
     */
    @PostMapping("/api/recommend/books")
    public List<String> recommendBooks(String genre) {
        List<String> recommendedBooks = new ArrayList<>();
        // 示例逻辑：根据用户偏好推荐书籍
        switch (genre) {
            case "科幻":
                recommendedBooks.add("三体");
                recommendedBooks.add("星际穿越");
                recommendedBooks.add("火星救援");
                recommendedBooks.add("银河帝国：基地");
                recommendedBooks.add("星际之门");
                break;
            case "文学":
                recommendedBooks.add("百年孤独");
                recommendedBooks.add("追风筝的人");
                recommendedBooks.add("挪威的森林");
                recommendedBooks.add("活着");
                recommendedBooks.add("飘");
                break;
            case "历史":
                recommendedBooks.add("明朝那些事儿");
                recommendedBooks.add("人类简史");
                recommendedBooks.add("世界是平的");
                recommendedBooks.add("枪炮、病菌与钢铁");
                recommendedBooks.add("大秦帝国");
                break;
            case "悬疑":
                recommendedBooks.add("福尔摩斯探案集");
                recommendedBooks.add("东方快车谋杀案");
                recommendedBooks.add("无人生还");
                recommendedBooks.add("白夜行");
                recommendedBooks.add("嫌疑人X的献身");
                break;
            case "编程":
                recommendedBooks.add("代码大全");
                recommendedBooks.add("计算机程序的构造和解释");
                recommendedBooks.add("算法导论");
                recommendedBooks.add("深入理解计算机系统");
                recommendedBooks.add("设计模式：可复用面向对象软件的基础");
                recommendedBooks.add("重构：改善既有代码的设计");
                recommendedBooks.add("Clean Code: 代码整洁之道");
                recommendedBooks.add("你不知道的JavaScript（上卷）");
                recommendedBooks.add("Java核心技术 卷I");
                recommendedBooks.add("C++ Primer Plus");
                recommendedBooks.add("Python编程：从入门到实践");
                recommendedBooks.add("数据结构与算法分析：C语言描述");
                recommendedBooks.add("计算机网络：自顶向下方法");
                recommendedBooks.add("操作系统概念");
                recommendedBooks.add("软件工程：实践者的研究方法");
                break;
            default:
                recommendedBooks.add("推荐失败，请选择一个书籍类型！");
                break;
        }
        return recommendedBooks;
    }

    /**
     * 生成随机笑话
     * @return
     */
    @GetMapping("/api/joke")
    public String getRandomJoke() {
        String[] jokes = {
                "为什么程序员喜欢暗室？因为那里没有错误（bugs）。",
                "我告诉计算机早点睡觉，它回答说‘应用程序错误’。",
                "为什么数学书看起来总是很悲伤？因为它总是充满了‘问题’。",
                "为什么AI助手总是很冷静？因为它知道，无论发生什么，它都不会过热。",
                "如果两个程序员结婚，他们会得到什么？一个bug，因为每次他们尝试修复一个问题时，就会引入一个新的问题。",
                "为什么数学家喜欢海边？因为所有的声波都是‘正弦’的。",
                "如果一个程序员掉进了黑洞会发生什么？他会被‘捕获’，并且永远无法‘逃逸’。",
                "为什么程序员不喜欢户外活动？因为它们没有‘窗口’。",
                "为什么计算机总是很谦虚？因为它总是说它是一个‘无头’设备。",
                "为什么程序员不喜欢去海滩？因为那里的沙子会弄脏他们的‘代码’。"
        };
        int jokeIndex = new Random().nextInt(jokes.length);
        return jokes[jokeIndex];
    }

}
