package edu.towson.cis.cosc442.project5.jamesbond;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class JamesBondTest {

	JamesBond test = new JamesBond();

	@Test
	public void testCase0() {
		assertFalse(test.bondRegex("("));
	}

	@Test
	public void testCase1() {
		assertFalse(test.bondRegex("(("));
	}

	@Test
	public void testCase2() {
		assertFalse(test.bondRegex("((("));
	}

	@Test
	public void testCase3() {
		assertFalse(test.bondRegex("(()"));
	}

	@Test
	public void testCase4() {
		assertTrue(test.bondRegex("((007)"));
	}

	@Test
	public void testCase5() {
		assertFalse(test.bondRegex("((07)"));
	}

	@Test
	public void testCase6() {
		assertFalse(test.bondRegex("((7)"));
	}

	@Test
	public void testCase7() {
		assertFalse(test.bondRegex("()"));
	}

	@Test
	public void testCase8() {
		assertFalse(test.bondRegex("()("));
	}

	@Test
	public void testCase9() {
		assertFalse(test.bondRegex("())"));
	}

	@Test
	public void testCase10() {
		assertTrue(test.bondRegex("()007)"));
	}

	@Test
	public void testCase11() {
		assertFalse(test.bondRegex("()07)"));
	}

	@Test
	public void testCase12() {
		assertFalse(test.bondRegex("()7)"));
	}

	@Test
	public void testCase13() {
		assertFalse(test.bondRegex("(0("));
	}

	@Test
	public void testCase14() {
		assertFalse(test.bondRegex("(0(("));
	}

	@Test
	public void testCase15() {
		assertFalse(test.bondRegex("(0()"));
	}

	@Test
	public void testCase16() {
		assertTrue(test.bondRegex("(0(007)"));
	}

	@Test
	public void testCase17() {
		assertFalse(test.bondRegex("(0(07)"));
	}

	@Test
	public void testCase18() {
		assertFalse(test.bondRegex("(0(7)"));
	}

	@Test
	public void testCase19() {
		assertFalse(test.bondRegex("(0)"));
	}

	@Test
	public void testCase20() {
		assertFalse(test.bondRegex("(0)("));
	}

	@Test
	public void testCase21() {
		assertFalse(test.bondRegex("(0))"));
	}

	@Test
	public void testCase22() {
		assertTrue(test.bondRegex("(0)007)"));
	}

	@Test
	public void testCase23() {
		assertFalse(test.bondRegex("(0)07)"));
	}

	@Test
	public void testCase24() {
		assertFalse(test.bondRegex("(0)7)"));
	}

	@Test
	public void testCase25() {
		assertFalse(test.bondRegex("(00("));
	}

	@Test
	public void testCase26() {
		assertFalse(test.bondRegex("(00(("));
	}

	@Test
	public void testCase27() {
		assertFalse(test.bondRegex("(00()"));
	}

	@Test
	public void testCase28() {
		assertTrue(test.bondRegex("(00(007)"));
	}

	@Test
	public void testCase29() {
		assertFalse(test.bondRegex("(00(07)"));
	}

	@Test
	public void testCase30() {
		assertFalse(test.bondRegex("(00(7)"));
	}

	@Test
	public void testCase31() {
		assertFalse(test.bondRegex("(00)"));
	}

	@Test
	public void testCase32() {
		assertFalse(test.bondRegex("(00)("));
	}

	@Test
	public void testCase33() {
		assertFalse(test.bondRegex("(00))"));
	}

	@Test
	public void testCase34() {
		assertTrue(test.bondRegex("(00)007)"));
	}

	@Test
	public void testCase35() {
		assertFalse(test.bondRegex("(00)07)"));
	}

	@Test
	public void testCase36() {
		assertFalse(test.bondRegex("(00)7)"));
	}

	@Test
	public void testCase37() {
		assertFalse(test.bondRegex("(000("));
	}

	@Test
	public void testCase38() {
		assertFalse(test.bondRegex("(000)"));
	}

	@Test
	public void testCase39() {
		assertTrue(test.bondRegex("(000007)"));
	}

	@Test
	public void testCase40() {
		assertFalse(test.bondRegex("(007)"));
	}

	@Test
	public void testCase41() {
		assertFalse(test.bondRegex("(007)"));
	}

	@Test
	public void testCase42() {
		assertFalse(test.bondRegex("(001("));
	}

	@Test
	public void testCase43() {
		assertFalse(test.bondRegex("(001)"));
	}

	@Test
	public void testCase44() {
		assertTrue(test.bondRegex("(001007)"));
	}

	@Test
	public void testCase45() {
		assertFalse(test.bondRegex("(00107)"));
	}

	@Test
	public void testCase46() {
		assertFalse(test.bondRegex("(0017)"));
	}

	@Test
	public void testCase47() {
		assertFalse(test.bondRegex("(002("));
	}

	@Test
	public void testCase48() {
		assertFalse(test.bondRegex("(002)"));
	}

	@Test
	public void testCase49() {
		assertTrue(test.bondRegex("(002007)"));
	}

	@Test
	public void testCase50() {
		assertFalse(test.bondRegex("(00207)"));
	}

	@Test
	public void testCase51() {
		assertFalse(test.bondRegex("(0027)"));
	}

	@Test
	public void testCase52() {
		assertFalse(test.bondRegex("(003("));
	}

	@Test
	public void testCase53() {
		assertFalse(test.bondRegex("(003)"));
	}

	@Test
	public void testCase54() {
		assertTrue(test.bondRegex("(003007)"));
	}

	@Test
	public void testCase55() {
		assertFalse(test.bondRegex("(00307)"));
	}

	@Test
	public void testCase56() {
		assertFalse(test.bondRegex("(0037)"));
	}

	@Test
	public void testCase57() {
		assertFalse(test.bondRegex("(004("));
	}

	@Test
	public void testCase58() {
		assertFalse(test.bondRegex("(004)"));
	}

	@Test
	public void testCase59() {
		assertTrue(test.bondRegex("(004007)"));
	}

	@Test
	public void testCase60() {
		assertFalse(test.bondRegex("(00407)"));
	}

	@Test
	public void testCase61() {
		assertFalse(test.bondRegex("(0047)"));
	}

	@Test
	public void testCase62() {
		assertFalse(test.bondRegex("(005("));
	}

	@Test
	public void testCase63() {
		assertFalse(test.bondRegex("(005)"));
	}

	@Test
	public void testCase64() {
		assertTrue(test.bondRegex("(005007)"));
	}

	@Test
	public void testCase65() {
		assertFalse(test.bondRegex("(00507)"));
	}

	@Test
	public void testCase66() {
		assertFalse(test.bondRegex("(0057)"));
	}

	@Test
	public void testCase67() {
		assertFalse(test.bondRegex("(006("));
	}

	@Test
	public void testCase68() {
		assertFalse(test.bondRegex("(006)"));
	}

	@Test
	public void testCase69() {
		assertTrue(test.bondRegex("(006007)"));
	}

	@Test
	public void testCase70() {
		assertFalse(test.bondRegex("(00607)"));
	}

	@Test
	public void testCase71() {
		assertFalse(test.bondRegex("(0067)"));
	}

	@Test
	public void testCase72() {
		assertFalse(test.bondRegex("(007("));
	}

	@Test
	public void testCase73() {
		assertFalse(test.bondRegex("(007(("));
	}

	@Test
	public void testCase74() {
		assertTrue(test.bondRegex("(007()"));
	}

	@Test
	public void testCase75() {
		assertTrue(test.bondRegex("(007(007)"));
	}

	@Test
	public void testCase76() {
		assertTrue(test.bondRegex("(007(07)"));
	}

	@Test
	public void testCase77() {
		assertTrue(test.bondRegex("(007(7)"));
	}

	@Test
	public void testCase78() {
		assertTrue(test.bondRegex("(007)"));
	}

	@Test
	public void testCase79() {
		assertTrue(test.bondRegex("(007)("));
	}

	@Test
	public void testCase80() {
		assertTrue(test.bondRegex("(007)(("));
	}

	@Test
	public void testCase81() {
		assertTrue(test.bondRegex("(007)()"));
	}

	@Test
	public void testCase82() {
		assertTrue(test.bondRegex("(007)(007)"));
	}

	@Test
	public void testCase83() {
		assertTrue(test.bondRegex("(007)(07)"));
	}

	@Test
	public void testCase84() {
		assertTrue(test.bondRegex("(007)(7)"));
	}

	@Test
	public void testCase85() {
		assertTrue(test.bondRegex("(007))"));
	}

	@Test
	public void testCase86() {
		assertTrue(test.bondRegex("(007))("));
	}

	@Test
	public void testCase87() {
		assertTrue(test.bondRegex("(007)))"));
	}

	@Test
	public void testCase88() {
		assertTrue(test.bondRegex("(007))007)"));
	}

	@Test
	public void testCase89() {
		assertTrue(test.bondRegex("(007))07)"));
	}

	@Test
	public void testCase90() {
		assertTrue(test.bondRegex("(007))7)"));
	}

	@Test
	public void testCase91() {
		assertTrue(test.bondRegex("(007)0("));
	}

	@Test
	public void testCase92() {
		assertTrue(test.bondRegex("(007)0)"));
	}

	@Test
	public void testCase93() {
		assertTrue(test.bondRegex("(007)0007)"));
	}

	@Test
	public void testCase94() {
		assertTrue(test.bondRegex("(007)007)"));
	}

	@Test
	public void testCase95() {
		assertTrue(test.bondRegex("(007)07)"));
	}

	@Test
	public void testCase96() {
		assertTrue(test.bondRegex("(007)1("));
	}

	@Test
	public void testCase97() {
		assertTrue(test.bondRegex("(007)1)"));
	}

	@Test
	public void testCase98() {
		assertTrue(test.bondRegex("(007)1007)"));
	}

	@Test
	public void testCase99() {
		assertTrue(test.bondRegex("(007)107)"));
	}

	@Test
	public void testCase100() {
		assertTrue(test.bondRegex("(007)17)"));
	}

	@Test
	public void testCase101() {
		assertTrue(test.bondRegex("(007)2("));
	}

	@Test
	public void testCase102() {
		assertTrue(test.bondRegex("(007)2)"));
	}

	@Test
	public void testCase103() {
		assertTrue(test.bondRegex("(007)2007)"));
	}

	@Test
	public void testCase104() {
		assertTrue(test.bondRegex("(007)207)"));
	}

	@Test
	public void testCase105() {
		assertTrue(test.bondRegex("(007)27)"));
	}

	@Test
	public void testCase106() {
		assertTrue(test.bondRegex("(007)3("));
	}

	@Test
	public void testCase107() {
		assertTrue(test.bondRegex("(007)3)"));
	}

	@Test
	public void testCase108() {
		assertTrue(test.bondRegex("(007)3007)"));
	}

	@Test
	public void testCase109() {
		assertTrue(test.bondRegex("(007)307)"));
	}

	@Test
	public void testCase110() {
		assertTrue(test.bondRegex("(007)37)"));
	}

	@Test
	public void testCase111() {
		assertTrue(test.bondRegex("(007)4("));
	}

	@Test
	public void testCase112() {
		assertTrue(test.bondRegex("(007)4)"));
	}

	@Test
	public void testCase113() {
		assertTrue(test.bondRegex("(007)4007)"));
	}

	@Test
	public void testCase114() {
		assertTrue(test.bondRegex("(007)407)"));
	}

	@Test
	public void testCase115() {
		assertTrue(test.bondRegex("(007)47)"));
	}

	@Test
	public void testCase116() {
		assertTrue(test.bondRegex("(007)5("));
	}

	@Test
	public void testCase117() {
		assertTrue(test.bondRegex("(007)5)"));
	}

	@Test
	public void testCase118() {
		assertTrue(test.bondRegex("(007)5007)"));
	}

	@Test
	public void testCase119() {
		assertTrue(test.bondRegex("(007)507)"));
	}

	@Test
	public void testCase120() {
		assertTrue(test.bondRegex("(007)57)"));
	}

	@Test
	public void testCase121() {
		assertTrue(test.bondRegex("(007)6("));
	}

	@Test
	public void testCase122() {
		assertTrue(test.bondRegex("(007)6)"));
	}

	@Test
	public void testCase123() {
		assertTrue(test.bondRegex("(007)6007)"));
	}

	@Test
	public void testCase124() {
		assertTrue(test.bondRegex("(007)607)"));
	}

	@Test
	public void testCase125() {
		assertTrue(test.bondRegex("(007)67)"));
	}

	@Test
	public void testCase126() {
		assertTrue(test.bondRegex("(007)7("));
	}

	@Test
	public void testCase127() {
		assertTrue(test.bondRegex("(007)7)"));
	}

	@Test
	public void testCase128() {
		assertTrue(test.bondRegex("(007)7007)"));
	}

	@Test
	public void testCase129() {
		assertTrue(test.bondRegex("(007)707)"));
	}

	@Test
	public void testCase130() {
		assertTrue(test.bondRegex("(007)77)"));
	}

	@Test
	public void testCase131() {
		assertTrue(test.bondRegex("(007)8("));
	}

	@Test
	public void testCase132() {
		assertTrue(test.bondRegex("(007)8)"));
	}

	@Test
	public void testCase133() {
		assertTrue(test.bondRegex("(007)8007)"));
	}

	@Test
	public void testCase134() {
		assertTrue(test.bondRegex("(007)807)"));
	}

	@Test
	public void testCase135() {
		assertTrue(test.bondRegex("(007)87)"));
	}

	@Test
	public void testCase136() {
		assertTrue(test.bondRegex("(007)9("));
	}

	@Test
	public void testCase137() {
		assertTrue(test.bondRegex("(007)9)"));
	}

	@Test
	public void testCase138() {
		assertTrue(test.bondRegex("(007)9007)"));
	}

	@Test
	public void testCase139() {
		assertTrue(test.bondRegex("(007)907)"));
	}

	@Test
	public void testCase140() {
		assertTrue(test.bondRegex("(007)97)"));
	}

	@Test
	public void testCase141() {
		assertFalse(test.bondRegex("(0070("));
	}

	@Test
	public void testCase142() {
		assertTrue(test.bondRegex("(0070)"));
	}

	@Test
	public void testCase143() {
		assertTrue(test.bondRegex("(0070007)"));
	}

	@Test
	public void testCase144() {
		assertTrue(test.bondRegex("(007007)"));
	}

	@Test
	public void testCase145() {
		assertTrue(test.bondRegex("(00707)"));
	}

	@Test
	public void testCase146() {
		assertFalse(test.bondRegex("(0071("));
	}

	@Test
	public void testCase147() {
		assertTrue(test.bondRegex("(0071)"));
	}

	@Test
	public void testCase148() {
		assertTrue(test.bondRegex("(0071007)"));
	}

	@Test
	public void testCase149() {
		assertTrue(test.bondRegex("(007107)"));
	}

	@Test
	public void testCase150() {
		assertTrue(test.bondRegex("(00717)"));
	}

	@Test
	public void testCase151() {
		assertFalse(test.bondRegex("(0072("));
	}

	@Test
	public void testCase152() {
		assertTrue(test.bondRegex("(0072)"));
	}

	@Test
	public void testCase153() {
		assertTrue(test.bondRegex("(0072007)"));
	}

	@Test
	public void testCase154() {
		assertTrue(test.bondRegex("(007207)"));
	}

	@Test
	public void testCase155() {
		assertTrue(test.bondRegex("(00727)"));
	}

	@Test
	public void testCase156() {
		assertFalse(test.bondRegex("(0073("));
	}

	@Test
	public void testCase157() {
		assertTrue(test.bondRegex("(0073)"));
	}

	@Test
	public void testCase158() {
		assertTrue(test.bondRegex("(0073007)"));
	}

	@Test
	public void testCase159() {
		assertTrue(test.bondRegex("(007307)"));
	}

	@Test
	public void testCase160() {
		assertTrue(test.bondRegex("(00737)"));
	}

	@Test
	public void testCase161() {
		assertFalse(test.bondRegex("(0074("));
	}

	@Test
	public void testCase162() {
		assertTrue(test.bondRegex("(0074)"));
	}

	@Test
	public void testCase163() {
		assertTrue(test.bondRegex("(0074007)"));
	}

	@Test
	public void testCase164() {
		assertTrue(test.bondRegex("(007407)"));
	}

	@Test
	public void testCase165() {
		assertTrue(test.bondRegex("(00747)"));
	}

	@Test
	public void testCase166() {
		assertFalse(test.bondRegex("(0075("));
	}

	@Test
	public void testCase167() {
		assertTrue(test.bondRegex("(0075)"));
	}

	@Test
	public void testCase168() {
		assertTrue(test.bondRegex("(0075007)"));
	}

	@Test
	public void testCase169() {
		assertTrue(test.bondRegex("(007507)"));
	}

	@Test
	public void testCase170() {
		assertTrue(test.bondRegex("(00757)"));
	}

	@Test
	public void testCase171() {
		assertFalse(test.bondRegex("(0076("));
	}

	@Test
	public void testCase172() {
		assertTrue(test.bondRegex("(0076)"));
	}

	@Test
	public void testCase173() {
		assertTrue(test.bondRegex("(0076007)"));
	}

	@Test
	public void testCase174() {
		assertTrue(test.bondRegex("(007607)"));
	}

	@Test
	public void testCase175() {
		assertTrue(test.bondRegex("(00767)"));
	}

	@Test
	public void testCase176() {
		assertFalse(test.bondRegex("(0077("));
	}

	@Test
	public void testCase177() {
		assertTrue(test.bondRegex("(0077)"));
	}

	@Test
	public void testCase178() {
		assertTrue(test.bondRegex("(0077007)"));
	}

	@Test
	public void testCase179() {
		assertTrue(test.bondRegex("(007707)"));
	}

	@Test
	public void testCase180() {
		assertTrue(test.bondRegex("(00777)"));
	}

	@Test
	public void testCase181() {
		assertFalse(test.bondRegex("(0078("));
	}

	@Test
	public void testCase182() {
		assertTrue(test.bondRegex("(0078)"));
	}

	@Test
	public void testCase183() {
		assertTrue(test.bondRegex("(0078007)"));
	}

	@Test
	public void testCase184() {
		assertTrue(test.bondRegex("(007807)"));
	}

	@Test
	public void testCase185() {
		assertTrue(test.bondRegex("(00787)"));
	}

	@Test
	public void testCase186() {
		assertFalse(test.bondRegex("(0079("));
	}

	@Test
	public void testCase187() {
		assertTrue(test.bondRegex("(0079)"));
	}

	@Test
	public void testCase188() {
		assertTrue(test.bondRegex("(0079007)"));
	}

	@Test
	public void testCase189() {
		assertTrue(test.bondRegex("(007907)"));
	}

	@Test
	public void testCase190() {
		assertTrue(test.bondRegex("(00797)"));
	}

	@Test
	public void testCase191() {
		assertFalse(test.bondRegex("(008("));
	}

	@Test
	public void testCase192() {
		assertFalse(test.bondRegex("(008)"));
	}

	@Test
	public void testCase193() {
		assertTrue(test.bondRegex("(008007)"));
	}

	@Test
	public void testCase194() {
		assertFalse(test.bondRegex("(00807)"));
	}

	@Test
	public void testCase195() {
		assertFalse(test.bondRegex("(0087)"));
	}

	@Test
	public void testCase196() {
		assertFalse(test.bondRegex("(009("));
	}

	@Test
	public void testCase197() {
		assertFalse(test.bondRegex("(009)"));
	}

	@Test
	public void testCase198() {
		assertTrue(test.bondRegex("(009007)"));
	}

	@Test
	public void testCase199() {
		assertFalse(test.bondRegex("(00907)"));
	}

	@Test
	public void testCase200() {
		assertFalse(test.bondRegex("(0097)"));
	}

	@Test
	public void testCase201() {
		assertFalse(test.bondRegex("(01("));
	}

	@Test
	public void testCase202() {
		assertFalse(test.bondRegex("(01)"));
	}

	@Test
	public void testCase203() {
		assertTrue(test.bondRegex("(01007)"));
	}

	@Test
	public void testCase204() {
		assertFalse(test.bondRegex("(0107)"));
	}

	@Test
	public void testCase205() {
		assertFalse(test.bondRegex("(017)"));
	}

	@Test
	public void testCase206() {
		assertFalse(test.bondRegex("(02("));
	}

	@Test
	public void testCase207() {
		assertFalse(test.bondRegex("(02)"));
	}

	@Test
	public void testCase208() {
		assertTrue(test.bondRegex("(02007)"));
	}

	@Test
	public void testCase209() {
		assertFalse(test.bondRegex("(0207)"));
	}

	@Test
	public void testCase210() {
		assertFalse(test.bondRegex("(027)"));
	}

	@Test
	public void testCase211() {
		assertFalse(test.bondRegex("(03("));
	}

	@Test
	public void testCase212() {
		assertFalse(test.bondRegex("(03)"));
	}

	@Test
	public void testCase213() {
		assertTrue(test.bondRegex("(03007)"));
	}

	@Test
	public void testCase214() {
		assertFalse(test.bondRegex("(0307)"));
	}

	@Test
	public void testCase215() {
		assertFalse(test.bondRegex("(037)"));
	}

	@Test
	public void testCase216() {
		assertFalse(test.bondRegex("(04("));
	}

	@Test
	public void testCase217() {
		assertFalse(test.bondRegex("(04)"));
	}

	@Test
	public void testCase218() {
		assertTrue(test.bondRegex("(04007)"));
	}

	@Test
	public void testCase219() {
		assertFalse(test.bondRegex("(0407)"));
	}

	@Test
	public void testCase220() {
		assertFalse(test.bondRegex("(047)"));
	}

	@Test
	public void testCase221() {
		assertFalse(test.bondRegex("(05("));
	}

	@Test
	public void testCase222() {
		assertFalse(test.bondRegex("(05)"));
	}

	@Test
	public void testCase223() {
		assertTrue(test.bondRegex("(05007)"));
	}

	@Test
	public void testCase224() {
		assertFalse(test.bondRegex("(0507)"));
	}

	@Test
	public void testCase225() {
		assertFalse(test.bondRegex("(057)"));
	}

	@Test
	public void testCase226() {
		assertFalse(test.bondRegex("(06("));
	}

	@Test
	public void testCase227() {
		assertFalse(test.bondRegex("(06)"));
	}

	@Test
	public void testCase228() {
		assertTrue(test.bondRegex("(06007)"));
	}

	@Test
	public void testCase229() {
		assertFalse(test.bondRegex("(0607)"));
	}

	@Test
	public void testCase230() {
		assertFalse(test.bondRegex("(067)"));
	}

	@Test
	public void testCase231() {
		assertFalse(test.bondRegex("(07("));
	}

	@Test
	public void testCase232() {
		assertFalse(test.bondRegex("(07)"));
	}

	@Test
	public void testCase233() {
		assertTrue(test.bondRegex("(07007)"));
	}

	@Test
	public void testCase234() {
		assertFalse(test.bondRegex("(0707)"));
	}

	@Test
	public void testCase235() {
		assertFalse(test.bondRegex("(077)"));
	}

	@Test
	public void testCase236() {
		assertFalse(test.bondRegex("(08("));
	}

	@Test
	public void testCase237() {
		assertFalse(test.bondRegex("(08)"));
	}

	@Test
	public void testCase238() {
		assertTrue(test.bondRegex("(08007)"));
	}

	@Test
	public void testCase239() {
		assertFalse(test.bondRegex("(0807)"));
	}

	@Test
	public void testCase240() {
		assertFalse(test.bondRegex("(087)"));
	}

	@Test
	public void testCase241() {
		assertFalse(test.bondRegex("(09("));
	}

	@Test
	public void testCase242() {
		assertFalse(test.bondRegex("(09)"));
	}

	@Test
	public void testCase243() {
		assertTrue(test.bondRegex("(09007)"));
	}

	@Test
	public void testCase244() {
		assertFalse(test.bondRegex("(0907)"));
	}

	@Test
	public void testCase245() {
		assertFalse(test.bondRegex("(097)"));
	}

	@Test
	public void testCase246() {
		assertFalse(test.bondRegex("(1("));
	}

	@Test
	public void testCase247() {
		assertFalse(test.bondRegex("(1)"));
	}

	@Test
	public void testCase248() {
		assertTrue(test.bondRegex("(1007)"));
	}

	@Test
	public void testCase249() {
		assertFalse(test.bondRegex("(107)"));
	}

	@Test
	public void testCase250() {
		assertFalse(test.bondRegex("(17)"));
	}

	@Test
	public void testCase251() {
		assertFalse(test.bondRegex("(2("));
	}

	@Test
	public void testCase252() {
		assertFalse(test.bondRegex("(2)"));
	}

	@Test
	public void testCase253() {
		assertTrue(test.bondRegex("(2007)"));
	}

	@Test
	public void testCase254() {
		assertFalse(test.bondRegex("(207)"));
	}

	@Test
	public void testCase255() {
		assertFalse(test.bondRegex("(27)"));
	}

	@Test
	public void testCase256() {
		assertFalse(test.bondRegex("(3("));
	}

	@Test
	public void testCase257() {
		assertFalse(test.bondRegex("(3)"));
	}

	@Test
	public void testCase258() {
		assertTrue(test.bondRegex("(3007)"));
	}

	@Test
	public void testCase259() {
		assertFalse(test.bondRegex("(307)"));
	}

	@Test
	public void testCase260() {
		assertFalse(test.bondRegex("(37)"));
	}

	@Test
	public void testCase261() {
		assertFalse(test.bondRegex("(4("));
	}

	@Test
	public void testCase262() {
		assertFalse(test.bondRegex("(4)"));
	}

	@Test
	public void testCase263() {
		assertTrue(test.bondRegex("(4007)"));
	}

	@Test
	public void testCase264() {
		assertFalse(test.bondRegex("(407)"));
	}

	@Test
	public void testCase265() {
		assertFalse(test.bondRegex("(47)"));
	}

	@Test
	public void testCase266() {
		assertFalse(test.bondRegex("(5("));
	}

	@Test
	public void testCase267() {
		assertFalse(test.bondRegex("(5)"));
	}

	@Test
	public void testCase268() {
		assertTrue(test.bondRegex("(5007)"));
	}

	@Test
	public void testCase269() {
		assertFalse(test.bondRegex("(507)"));
	}

	@Test
	public void testCase270() {
		assertFalse(test.bondRegex("(57)"));
	}

	@Test
	public void testCase271() {
		assertFalse(test.bondRegex("(6("));
	}

	@Test
	public void testCase272() {
		assertFalse(test.bondRegex("(6)"));
	}

	@Test
	public void testCase273() {
		assertTrue(test.bondRegex("(6007)"));
	}

	@Test
	public void testCase274() {
		assertFalse(test.bondRegex("(607)"));
	}

	@Test
	public void testCase275() {
		assertFalse(test.bondRegex("(67)"));
	}

	@Test
	public void testCase276() {
		assertFalse(test.bondRegex("(7("));
	}

	@Test
	public void testCase277() {
		assertFalse(test.bondRegex("(7)"));
	}

	@Test
	public void testCase278() {
		assertTrue(test.bondRegex("(7007)"));
	}

	@Test
	public void testCase279() {
		assertFalse(test.bondRegex("(707)"));
	}

	@Test
	public void testCase280() {
		assertFalse(test.bondRegex("(77)"));
	}

	@Test
	public void testCase281() {
		assertFalse(test.bondRegex("(8("));
	}

	@Test
	public void testCase282() {
		assertFalse(test.bondRegex("(8)"));
	}

	@Test
	public void testCase283() {
		assertTrue(test.bondRegex("(8007)"));
	}

	@Test
	public void testCase284() {
		assertFalse(test.bondRegex("(807)"));
	}

	@Test
	public void testCase285() {
		assertFalse(test.bondRegex("(87)"));
	}

	@Test
	public void testCase286() {
		assertFalse(test.bondRegex("(9("));
	}

	@Test
	public void testCase287() {
		assertFalse(test.bondRegex("(9)"));
	}

	@Test
	public void testCase288() {
		assertTrue(test.bondRegex("(9007)"));
	}

	@Test
	public void testCase289() {
		assertFalse(test.bondRegex("(907)"));
	}

	@Test
	public void testCase290() {
		assertFalse(test.bondRegex("(97)"));
	}

	@Test
	public void testCase291() {
		assertFalse(test.bondRegex(")"));
	}

	@Test
	public void testCase292() {
		assertFalse(test.bondRegex(")("));
	}

	@Test
	public void testCase293() {
		assertFalse(test.bondRegex("))"));
	}

	@Test
	public void testCase294() {
		assertFalse(test.bondRegex(")007)"));
	}

	@Test
	public void testCase295() {
		assertFalse(test.bondRegex(")07)"));
	}

	@Test
	public void testCase296() {
		assertFalse(test.bondRegex(")7)"));
	}

	@Test
	public void testCase297() {
		assertFalse(test.bondRegex("0("));
	}

	@Test
	public void testCase298() {
		assertFalse(test.bondRegex("0)"));
	}

	@Test
	public void testCase299() {
		assertFalse(test.bondRegex("0007)"));
	}

	@Test
	public void testCase300() {
		assertFalse(test.bondRegex("007)"));
	}

	@Test
	public void testCase301() {
		assertFalse(test.bondRegex("07)"));
	}

	@Test
	public void testCase302() {
		assertFalse(test.bondRegex("1("));
	}

	@Test
	public void testCase303() {
		assertFalse(test.bondRegex("1)"));
	}

	@Test
	public void testCase304() {
		assertFalse(test.bondRegex("1007)"));
	}

	@Test
	public void testCase305() {
		assertFalse(test.bondRegex("107)"));
	}

	@Test
	public void testCase306() {
		assertFalse(test.bondRegex("17)"));
	}

	@Test
	public void testCase307() {
		assertFalse(test.bondRegex("2("));
	}

	@Test
	public void testCase308() {
		assertFalse(test.bondRegex("2)"));
	}

	@Test
	public void testCase309() {
		assertFalse(test.bondRegex("2007)"));
	}

	@Test
	public void testCase310() {
		assertFalse(test.bondRegex("207)"));
	}

	@Test
	public void testCase311() {
		assertFalse(test.bondRegex("27)"));
	}

	@Test
	public void testCase312() {
		assertFalse(test.bondRegex("3("));
	}

	@Test
	public void testCase313() {
		assertFalse(test.bondRegex("3)"));
	}

	@Test
	public void testCase314() {
		assertFalse(test.bondRegex("3007)"));
	}

	@Test
	public void testCase315() {
		assertFalse(test.bondRegex("307)"));
	}

	@Test
	public void testCase316() {
		assertFalse(test.bondRegex("37)"));
	}

	@Test
	public void testCase317() {
		assertFalse(test.bondRegex("4("));
	}

	@Test
	public void testCase318() {
		assertFalse(test.bondRegex("4)"));
	}

	@Test
	public void testCase319() {
		assertFalse(test.bondRegex("4007)"));
	}

	@Test
	public void testCase320() {
		assertFalse(test.bondRegex("407)"));
	}

	@Test
	public void testCase321() {
		assertFalse(test.bondRegex("47)"));
	}

	@Test
	public void testCase322() {
		assertFalse(test.bondRegex("5("));
	}

	@Test
	public void testCase323() {
		assertFalse(test.bondRegex("5)"));
	}

	@Test
	public void testCase324() {
		assertFalse(test.bondRegex("5007)"));
	}

	@Test
	public void testCase325() {
		assertFalse(test.bondRegex("507)"));
	}

	@Test
	public void testCase326() {
		assertFalse(test.bondRegex("57)"));
	}

	@Test
	public void testCase327() {
		assertFalse(test.bondRegex("6("));
	}

	@Test
	public void testCase328() {
		assertFalse(test.bondRegex("6)"));
	}

	@Test
	public void testCase329() {
		assertFalse(test.bondRegex("6007)"));
	}

	@Test
	public void testCase330() {
		assertFalse(test.bondRegex("607)"));
	}

	@Test
	public void testCase331() {
		assertFalse(test.bondRegex("67)"));
	}

	@Test
	public void testCase332() {
		assertFalse(test.bondRegex("7("));
	}

	@Test
	public void testCase333() {
		assertFalse(test.bondRegex("7)"));
	}

	@Test
	public void testCase334() {
		assertFalse(test.bondRegex("7007)"));
	}

	@Test
	public void testCase335() {
		assertFalse(test.bondRegex("707)"));
	}

	@Test
	public void testCase336() {
		assertFalse(test.bondRegex("77)"));
	}

	@Test
	public void testCase337() {
		assertFalse(test.bondRegex("8("));
	}

	@Test
	public void testCase338() {
		assertFalse(test.bondRegex("8)"));
	}

	@Test
	public void testCase339() {
		assertFalse(test.bondRegex("8007)"));
	}

	@Test
	public void testCase340() {
		assertFalse(test.bondRegex("807)"));
	}

	@Test
	public void testCase341() {
		assertFalse(test.bondRegex("87)"));
	}

	@Test
	public void testCase342() {
		assertFalse(test.bondRegex("9("));
	}

	@Test
	public void testCase343() {
		assertFalse(test.bondRegex("9)"));
	}

	@Test
	public void testCase344() {
		assertFalse(test.bondRegex("9007)"));
	}

	@Test
	public void testCase345() {
		assertFalse(test.bondRegex("907)"));
	}

	@Test
	public void testCase346() {
		assertFalse(test.bondRegex("97)"));
	}

}
