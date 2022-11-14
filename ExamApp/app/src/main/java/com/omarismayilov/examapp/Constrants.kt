package com.omarismayilov.examapp

object Constrants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val que1 = Questions(1,"1919-cu ilin dekabrında mədəniyyətimizin tarixində mühüm hadisə: ",
            "A)İlk qızlar məktəbinin yaradılması ",
            "B)«Azərbaycan» qəzetinin nəşri",
            "C)Maarif Nazirliyinin yaradılması",
            "D)«İstiqlal» muzeyinin açılması",
            "E)Bakı teatr məktəbinin açılması",
            4)

        questionsList.add(que1)

        val que2 = Questions(2,"Sanatürkün Ermənistana yürüşündən Amid vuruşmasına qədər neçə il keçmişdir?",
            "A) 18 ",
            "B) 28",
            "C) 32 ",
            "D) 22 ",
            "E) 30",
            4)

        questionsList.add(que2)


        val que3 = Questions(3,"XI –XIII əsrlərin görkəmli Azərbaycan şairləri:  ",
            "A) Həsənoğlu, Cahanşah Həqiqi, Əbül-üla Gəncəvi, Nizami Gəncəvi",
            "B) Xəqani,Əcəmi, Rəşidəddin, Məhəmməd Naxçıvani, Nizami Gəncəvi ",
            "C) Qətran Təbrizi,Nəimi, Fəlaki Şirvani, Məhsəti Gəncəvi, Xəqani Şirvani",
            "D) Əbül-üla Gəncəvi, Qətran Təbrizi, Məhsəti Gəncəvi, Xəqani Şirvani, Nizami Gəncəv",
            "E) Fələki Şirvani, Mücürəddin Beyləqani, Nizami Gəncəvi, Səfiəddin Ürməvi, Əvhədi  ",
            4)

        questionsList.add(que3)


        val que4 = Questions(4,"1905-ci ilin fevral və avqustunda çar hökuməti Azərbaycanın hansı ərazilərində \n" +
                "qırğın təşkil etdi ?",
            "A) Bakıda və Qubada",
            "B) Naxçıvanda və İrəvanda  ",
            "C) Bakıda və Gəncədə",
            "D) Şamaxıda və Qubada",
            "E) Şuşada və Bakıda",
            5)

        questionsList.add(que4)

        val que5 = Questions(5," I Şah İsmayıl nə üçün Portuqaliyalıların İran körfəzində möhkəmlənməsinə şərait \n" +
                "yaratdı: ",
            "A) Portuqallar vasitəsi ilə qərbdən silah və artilleriya mütəxəssisləri gətirmək üçün  ",
            "B) Böyük Moğol dövlətini məğlub etmək üçün",
            "C) Hind okeanındakı adaları ələ keçirmək üçün",
            "D) Hindistana gedən dəniz yolunu ələ keçirmək üçün",
            "E) Özbəkləri məğlub etmək üçün",
            1)

        questionsList.add(que5)
        val que6 = Questions(6," I İsmayılın qələbə qazandığı döyüşlər:  \n" +
                "-----1. Caldıran 2. Şərur 3.Çobani  \n" +
                "-----4.Mus 5.Almaqulağı 6.İsfahan",
            "A) 3,4,6  ",
            "B) 2,3,5",
            "C) 4,5,6",
            "D) 1,2,3",
            "E) 2,3,4",
            2)

        questionsList.add(que6)
        val que7 = Questions(7," S.C.Pişəvəli başda olmaqla Cənubi Azərbaycanda Milli hökümət yaradılmışdır:  ",
            "A) 6 yanvar 1946-cı ildə ",
            "B) 16 fevral 1946-cı ildə",
            "C) 27 noyabr 1945-ci ildə ",
            "D) 12 dekabr 1945-ci ildə",
            "E) 24 iyun 1946-cı ildə ",
            4)

        questionsList.add(que7)
        val que8= Questions(8,"Xronoloci ardıcıllığı müəyyən edin:",
            "A) Salarilər dövlətinin yaranması,Dəbil əmirliyinin yaranması,“Bərdə faciəsi”",
            "B) Dəbil əmirliyinin yaranması, “Bərdə faciəsi”,Salarilər dövlətinin yaranması ",
            "C) “Bərdə faciəsi”, Salarilər dövlətinin yaranması,Dəbil əmirliyinin yaranması ",
            "D) Dəbil əmirliyinin yaranması,Salarilər dövlətinin yaranması,“Bərdə faciəsi”",
            "E) Salarilər dövlətinin yaranması, Bərdə faciəsi”, Dəbil əmirliyinin yaranması",
            5)

        questionsList.add(que8)
        val que9 = Questions(9," XIX əsrin 30-cu illərində baş vermiş üsyanların xronoloci ardıcıllığını göstərin: \n" +
                "1- Quba üsyanı  \n" +
                "2- Car-Balakən üsyanı  \n" +
                "3- Şəki üsyanı  \n" +
                "4- Lənkəran üsyanı  ",
            "A) 1,2,3,4  ",
            "B) 3,1,4,2 ",
            "C) 2,4,1,3",
            "D) 2,3,4,1  ",
            "E) 2,3,1,4",
            3)

        questionsList.add(que9)
        val que10 = Questions(10,"I Şam Mirzənin əhali arasında şöhrətlənməsinin səbəbi: ",
            "A) Muğana 32 kq çıxarılmış insan gözü göndərmiş Dərbənd hakimi Məhəmməd xanı \n" +
                    "cəzalandırması",
            "B) İran məmurlarını həbs etməsi  ",
            "C) Əhalinin Ağsudan Şamaxıya qaytarılması  ",
            "D) Şəki üsyançılarına kömək göstərməsi",
            "E) Xalqın vergilərdən azad edilməsi  ",
            5)

        questionsList.add(que10)

        return questionsList

    }


}
