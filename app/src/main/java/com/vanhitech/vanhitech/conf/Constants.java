package com.vanhitech.vanhitech.conf;


import com.vanhitech.protocol.object.AppEnv;
import com.vanhitech.vanhitech.R;
import com.vanhitech.vanhitech.utils.LogUtils;

/**
 * 创建者     heyn
 * 创建时间   2016/3/9 17:06
 * 描述	      ${TODO}
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */
public class Constants {

    /**
     * LEVEL_ALL:打开应用程序里面所有输入的日志 7
     * LEVEL_OFF:关闭应用程序里面所有输入的日志 0
     */
    public static final int DEBUGLEVEL = LogUtils.LEVEL_ALL;
    /*
    ip 端口
    218.67.54.154", 220
     */
//    public static final String IP = "218.67.54.154";
    public static final String IP = "218.67.54.154";//
    public static final int PORT=220;
//    public static final int PORT=221;
    //销毁需要判断标志
    public  static Boolean isPrompt=false;
    //退出不销毁
    public  static Boolean isPromptfinish=false;
    public  static Boolean mIsSaveDevice=false;
    public  static Boolean TIMEING=true; //定时

    public  static int isRid= R.id.content_rb_home;//

    public final static int APP_VERSION = 10000;
    public final static int type = 10019;//000
//    public final static int type = 000;//000
    public final static String FACTORY_ID = "%" + type+""; // 厂商id


    public static AppEnv appEnv = new AppEnv("Android%"+APP_VERSION,""+APP_VERSION, APP_VERSION, null,
            null, null, null);
//
//    public static AppEnv appEnv = new AppEnv("Android%10000", null, 10008, null,
//            null, null, null);
//    AppEnv appEnv = new AppEnv("Android%10008", "10008", 10008, null, null, null, null);
    // 设备id 前3识别
    public static final String id0="00";       //中控
    public static final String id1="01";       //2.4G插座
    public static final String id2="02";       //2.4G墙壁开关
    public static final String id3="03";       //2.4G灯开关控制  !
    public static final String id4="04";       //2.4G灯开关及调光控
    public static final String id5="05";       //2.4G空调万用遥控器
    public static final String id6="06";       //2.4G RGB灯控制
    public static final String id7="07";       //WIFI电视锁及控制中心
    public static final String id8="08";       //2.4G遥控器
    public static final String id9="09";       //WIFI控制中心
    public static final String idA="0A";       //空调功率插头+遥控器
    public static final String idB="0B";       //2.4G RGB灯控制  !
    public static final String idC="0C";       //2.4G RGB灯控制  !
    public static final String idD="0D";       //2.4G冷暖灯开关及调光控制 !
    public static final String idE="0E";       //机顶盒控制中心
    public static final String idF="0F";       //2.4G RGB灯控制  !
    public static final String id10="10";      //2.4G窗帘开关控制器
    public static final String id11="11";      //2.4G电饭煲
    public static final String id12="12";      //2.4G环境检测仪
    public static final String id13="13";      //待计量插座
    public static final String id14="14";      //中央空调控制面板
    public static final String id15="15";      //带中继2.4G插座
    public static final String id7c="7c";      //一键配置

    //viewpager 更新标识 auto
    public static Boolean updateViewpager=false;
    public static Boolean Isauto=false;



    // 匹配时发码
    public static byte[] match = new byte[] { 0x05, 0x00, 0x00, 0x00, 0x09,
            0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x21, 0x00, 0x00,
            0x00 };
    // 控制时发码
    public static byte[] set_air = new byte[] { 0x06, 0x00, 0x00, 0x00, 0x00,
            0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
            0x00 };
    // 空调设备类型
    public final static int air_type[][] = new int[][] {
            { 410, 411, 412, 413, 414, 415, 416, 417, 418, 419, 420, 421, 422,
                    423, 424 }, // 兰谷
            { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
                    19, 20, 21, 22, 23, 24 },// 格力
            { 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                    41, 42, 43, 44 },// 美的/东芝
            { 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                    61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74 }, // 长虹
            { 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                    91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103,
                    104, 105, 106, 107, 108, 109 }, // 志高
            { 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122,
                    123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134,
                    135, 136, 137, 138, 139 }, // 松下/乐声
            { 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152,
                    153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164 },// 海尔
            { 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177,
                    178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189,
                    190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201,
                    202, 203, 204 }, // 三菱
            { 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217,
                    218, 219, 220, 221, 222, 223, 224 },// 格兰仕
            { 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237,
                    238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249 },// 科龙/华宝
            { 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 260, 261, 262,
                    263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 273, 274 }, // 奥克斯
            { 275, 276, 277, 278, 279, 280, 281, 282, 283, 284, 285, 286, 287,
                    288, 289, 290, 291, 292, 293, 294 },// 夏普/声宝
            { 295, 296, 297, 298, 299, 300, 301, 302, 303, 304, 305, 306, 307,
                    308, 309, 310, 311, 312, 313, 314, 315, 316, 317, 318, 319 },// 大金
            { 320, 321, 322, 323, 324, 325, 326, 327, 328, 329, 330, 331, 332,
                    333, 334, 335, 336, 337, 338, 339 },// 海信
            { 340, 341, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 352,
                    353, 354, 355, 356, 357, 358, 359 }, // 富士通
            { 360, 361, 362, 363, 364, 365, 366, 367, 368, 369, 370, 371, 372,
                    373, 374, 375, 376, 377, 378, 379, 380, 381, 382, 383, 384 },// 华凌
            { 385, 386, 387, 388, 389, 390, 391, 392, 393, 394 }, // LG
            { 395, 396, 397, 398, 399, 400, 401, 402, 403, 404, 405, 406, 407,
                    408, 409 },// 日立
            { 410, 411, 412, 413, 414, 415, 416, 417, 418, 419, 420, 421, 422,
                    423, 424 }, // TCL
            { 425, 426, 427, 428, 429, 430, 431, 432, 433, 434, 435, 436, 437,
                    438, 439 }, // 三洋
            { 440, 441, 442, 443, 444 }, // 惠而浦
            { 445, 446, 447, 448, 449 }, // 乐华
            { 450, 451, 452, 453, 454, 455, 456, 457, 458, 459 },// 伊莱克斯
            { 460, 461, 462, 463, 464, 465, 466, 467, 468, 469 }, // 约克
            { 470, 471, 472, 473, 474 },// 澳柯玛
            { 475, 476, 477, 478, 479 },// 春兰
            { 480, 481, 482, 483, 484 },// 新科
            { 485, 486, 487, 488, 489 }, // 三星
            { 490, 491, 492, 493, 494 },// 开利
            { 495, 496, 497, 498, 499 }, // 蓝波
            { 500, 501, 502, 503, 504 },// 新飞
            { 505, 506, 507, 508, 509 },// 麦克维尔
            { 510, 511, 512 }, // 汇丰
            { 513, 514 }, // 南风
            { 515, 516 },// 大宇
            { 517, 518 }, // 先科
            { 519, 520 },// 胜风
            { 521, 522, 523, 524, 525 },// 扬子
            { 526, 527, 528, 529, 530 },// 万宝
            { 531, 532, 533, 534, 535 },// 波尔卡
            { 536, 537, 538, 539, 540 },// 天元
            { 541, 542, 543, 544, 545 },// 东宝
            { 546, 547, 548 }, // 飞鹿
            { 549, 550, 551 }, // 小鸭
            { 552, 553 }, // 双鹿
            { 554, 555 },// 凉宇
            { 556, 557, 558 },// 小天鹅
            { 559, 560, 561 }, // 索华
            { 562, 563 },// 朗歌
            { 564, 565 }, // 皇冠
            { 566, 567 },// 众力
            { 568, 569 },// 塔兰迪
            { 570, 571 },// 雾峰
            { 572, 573, 574, 575, 576, 577, 578, 579, 580, 581, 582, 583, 584,
                    585, 586, 587, 588, 589, 590, 591, 592, 593, 594, 595, 596,
                    597, 598, 599, 600, 601, 602, 603, 604, 605, 606, 607, 608,
                    609, 610 },// 杂牌
            { 611, 612, 613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623,
                    624, 625, 626, 627, 628, 629, 630, 631, 632, 633, 634, 635,
                    636, 637, 638, 639, 640, 641, 642, 643, 644, 645, 646, 647,
                    648, 649, 650, 651, 652, 653, 654, 655, 656, 657, 658, 659,
                    660, 661, 662, 663, 664, 665, 666, 667, 668, 669, 670, 671,
                    672, 673, 674, 675, 676, 677, 678, 679, 680, 681, 682, 683,
                    684, 685, 686, 687, 688, 689, 690, 691, 692, 693, 694, 695,
                    696, 697, 698, 699, 700, 701, 702, 703, 704, 705, 706, 707,
                    708, 709, 710, 711, 712, 713, 714, 715, 716, 717, 718, 719,
                    720, 721, 722, 723, 724, 725, 726, 727, 728, 729, 730, 731,
                    732, 733, 734, 735, 736, 737, 738, 739, 740, 741, 742, 743,
                    744, 745, 746, 747, 748, 749, 750, 751, 752, 753, 754, 755,
                    756, 757, 758, 759, 760, 761, 762, 763, 764, 765, 766, 767,
                    768, 769, 770, 771, 772, 773, 774, 775, 776, 777, 778, 779,
                    780, 781, 782, 783, 784, 785, 786, 787, 788, 789, 790, 791,
                    792, 793, 794, 795, 796, 797, 798, 799, 800, 801, 802, 803,
                    804, 805, 806, 807, 808, 809, 810, 811, 812, 813, 814, 815,
                    816, 817, 818, 819, 820, 821, 822, 823, 824, 825, 826, 827,
                    828, 829, 830, 831, 832, 833, 834, 835, 836, 837, 838, 839,
                    840, 841, 842, 843, 844, 845, 846, 847, 848, 849, 850, 851,
                    852, 853, 854, 855, 856, 857, 858, 859, 860, 861, 862, 863,
                    864, 865, 866, 867, 868, 869, 870, 871, 872, 873, 874, 875,
                    876, 877, 878, 879, 880, 881, 882, 883, 884, 885, 886, 887,
                    888, 889, 890, 891, 892, 893, 894, 895, 896, 897, 898, 899,
                    900, 901, 902, 903, 904, 905, 906, 907, 908, 909, 910, 911,
                    912, 913, 914, 915, 916, 917, 918, 919, 920, 921, 922, 923,
                    924, 925, 926, 927, 928, 929, 930, 931, 932, 933, 934, 935,
                    936, 937, 938, 939, 940, 941, 942, 943, 944, 945, 946, 947,
                    948, 949, 950, 951, 952, 953, 954, 955, 956, 957, 958, 959,
                    960, 961, 962, 963, 964, 965, 966, 967, 968, 969, 970, 971,
                    972, 973, 974, 975, 976, 977, 978, 979, 980, 981, 982, 983,
                    984, 985, 986, 987, 988, 989, 990, 991, 992, 993, 994, 995,
                    996, 997, 998, 999 },// 其它品牌
    };

}