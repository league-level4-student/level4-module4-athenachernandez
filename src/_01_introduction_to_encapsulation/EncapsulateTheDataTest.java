package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulateTheDataTest {
	EncapsulateTheData e = new EncapsulateTheData();

	@Test
	public void testItemsReceived() {
		e.setDegreesTurned(400.0f);
		assertEquals(360.0f, e.getDegreesTurned(), 0.01);
	}

	public void testDegreesTurned() {
		e.setItemsReceived(-50);
		assertEquals(0, e.getItemsReceived());
	}

	public void testNomenclature() {
		e.setMemberObj("yes");
		assertEquals(0, e.getMemberObj());
	}

	public void testMemberObj() {
		e.setNomenclature("");
		assertEquals(0, e.getNomenclature());
	}
}
