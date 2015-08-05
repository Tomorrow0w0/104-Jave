
import java.util.Scanner;
public class A12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入生日月份？");
		int M = scn.nextInt();		
		System.out.print("請輸入生日日期？");
		int D = scn.nextInt();			
		if ((M==1 && D>=20) || (M==2 && D<=18)){
			System.out.print("水瓶座終極完美分析(01/20-02/18)");
			System.out.print("\n幾乎每個水瓶座的心底都有著一段刻骨銘心人間記憶，一個永遠無法忘記的背影。 那也許只是極其短暫的兩情相悅，只是一種單戀，或只是一種只存在於虛幻空間。 一切看起來是那麼平靜，那麼和諧。");	
		}
		if ((M==2 && D>=19) || (M==3 && D<=20)){
			System.out.print("雙魚座終極完美分析(02/19-03/20)");
			System.out.print("\n看過很多關於雙魚的各種傳說，分析，解釋。似乎無一例外的把雙魚當作了一個女人的星座，動不動就是流眼淚，唉聲歎氣。可惜可歎，如果雙魚真的只是這樣的一個星座，那麼可以說沒有一個人願意去做雙魚，而歷史上也不會有什麼著名的雙魚人物了。");	
		}
		if ((M==3 && D>=21) || (M==4 && D<=19)){
			System.out.print("牡羊座終極完美分析(03/21-04/19)");
			System.out.print("\n牡羊嗎？太恐怖了！他們脾氣大、暴力、瞧不起人，還是躲遠些、小心為妙！如果你這末認為，那你可能就會失去一個肯為你付出生命的人。受火星的灼燒，牡羊決不是人們想像中的那種冷血狂魔！ 牡羊的內心世界有兩個：恨的世界與愛的世界。牡羊的外顯世界與內心世界是同步的，只不過由於他的恨意更昭顯，以至於掩蓋了他愛的那一面。");	
		}
		if ((M==4 && D>=20) || (M==5 && D<=20)){
			System.out.print("金牛座終極完美分析(04/20-05/20)");
			System.out.print("\n與一般星座書上描寫的金牛們相反，其實金牛座非常具有幽默感。他們天生就有搞笑的才能，善於製造輕鬆的氛圍，不要再將牛牛們認為成是一群僵硬腐化的人，相反他們很可愛。還記得在《滿城盡帶黃金甲》的發佈會場上不斷耍寶的金牛發哥嗎？他的幽默感絕對令資深娛記也大跌眼鏡，人緣好不是隨便說說的，金牛座有著寬厚的胸懷。");	
		}
		if ((M==5 && D>=21) || (M==6 && D<=21)){
			System.out.print("雙子座終極完美分析(05/21-06/21)");
			System.out.print("\n有很多的朋友，可是看起來朋友很多，可是知心的沒有幾個這句話很深刻的形容了雙子。雙子很能說話，他跟別人可以天南地北的聊，可以聊得很八卦，也會聊一些很嚴肅的話題。雙子可以跟你聊很多東西，可是注意了，他都只是跟你聊一些不關自己的事。隨便他跟你說些什麼，可是跟自己有關的都只是些皮毛而已。比如，今天又有某個明星怎樣怎樣了；隔壁班有多少美女帥哥的。關於自己的事，他幾乎是不說的，就算是說，也是說一些關於自己無關痛癢的事。當你想更進一步的瞭解雙子，他會很自然的把話題給扯開。");	
		}
		if ((M==6 && D>=22) || (M==7 && D<=22)){
			System.out.print("巨蟹座終極完美分析(06/22-07/22)");
			System.out.print("\n巨蟹是心軟的，容易被感動，即使表面看起來總是有一副硬硬的殼，但那殼子底下是一顆柔軟敏感到極至的內心。它們面對一份感情是猶豫再三的，不要說它們懦弱，它們只是明白自己是容易受傷的。他們對感情抱有信仰，相信純真、相信天長地久，所以有時是挑剔的。");	
		}
		if ((M==7 && D>=23) || (M==8 && D<=22)){
			System.out.print("獅子座終極完美分析(07/23-08/22)");
			System.out.print("\n獅子座，一個博愛和充滿陽光，能量的星座，其實獅子座的人很嚮往愛情，他所擁有的愛情有的時候不是真的愛情，或者只是一種嚮往或者是自己的夢想，說白了就是獅子座的人最愛的是自己，他要讓自己發光發熱，獲得別人的愛和崇敬，在這其中，他能夠體會到這種來自他人的關愛而感到愉悅，於是，他就愛上了別人。。。可是，獅子座的我們想想，仔細想想，你真的愛了嗎？真的像你說的那樣的愛嗎？");	
		}
		if ((M==8 && D>=23) || (M==9 && D<=22)){
			System.out.print("處女座終極完美分析(08/23-09/22)");
			System.out.print("\n都說處女座另類，雙重性格，甚至有點神經質，其實原因只有一個，處女座的一切都要隨自己外顯的性格而轉，姑且稱之為狀態。處女座狀態好的時候，可以將自己聰明、細膩、能幹、溫情、幽默、有內涵等優良品質完全外展，此時他們顯得如此完美，光芒四射，並且可以表現得非常外向、健談，容易與人打成一片（這本非他們的性格）。而一旦處女座狀態不好，便會變成另一個人，甚至非常窩囊，一事無成，不過通常此時他們都躲避外在的干擾,所以讓人感覺有點間歇性自閉症)因為同為水星守護，所以處女和雙子一樣善變，但雙子善變的是心思，處女善變的卻是情緒。");	
		}
		if ((M==9 && D>=23) || (M==10 && D<=22)){
			System.out.print("天秤座終極完美分析(09/23-10/22)");
			System.out.print("\n優雅的天平在燈紅酒綠中微笑轉身，顧盼神采，灑脫如同水中的魚。他們與紅酒，水晶杯，晚禮服，鋼琴曲是那麼的相得益彰，漫不經意的吸引著公眾的眼光……幾乎所有人都有這樣一種印象。");	
		}
		if ((M==10 && D>=23) || (M==11 && D<=21)){
			System.out.print("天蠍座終極完美分析(10/23-11/21)");
			System.out.print("\n天蠍，生於秋深。性喜靜，意清幽。愛之切，怨亦深。本質輕名利，但擁有成名得利的天賦。 偏重靈與肉的完美結合。直覺力之準之銳，行動力之瀟灑之特,常令徒有虛表之人忌憤不已。天蠍，一個別具一格的星座。格調分明有別常人，心胸高妙不露於表。常容人難容之事，亦笑人可笑之處。");	
		}
		if ((M==11 && D>=22) || (M==12 && D<=21)){
			System.out.print("射手座終極完美分析(11/22-12/21)");
			System.out.print("\n樂觀與憂愁：射手座人的內心不是外表看上去那麼樂觀的，因為喜歡看的遠，容易擔憂的事情也就多，在他們的字典裡，即使現在好，也不一定代表未來好，有時候很多人覺得很好的一個工作或一個伴侶，他們很輕易的就會放棄掉，可能只是因為一個毫不起眼的小原因。所以，這樣的外在表現，就讓人們覺得他們不喜歡被某件事情或某個人束縛住，追求自由的，沒有壓力的感覺。");	
		}
		if ((M==12 && D>=22) || (M==1 && D<=19)){
			System.out.print("魔羯座終極完美分析(12/22-01/19)");
			System.out.print("\n年輕的魔羯都是很單純的，我想他們也不會知道自己將從天使變成惡魔，魔羯座的人天生善良，感情也都很脆弱，也許會因為一些很小的事情難過很長時間，所以他們通常在表面表現的酷酷的與事隔離的樣子，其實他們只是不希望讓別人看到他脆弱的一面，堅強，理智，承受是魔羯的代名詞，他們並不是很隨便的表達自己所想，他們希望瞭解身邊所有人的性格，並不是因為好奇，好像只是因為一種安全感，為了保護自己魔羯生出了一種特殊能力。");	
		}
	}

}
