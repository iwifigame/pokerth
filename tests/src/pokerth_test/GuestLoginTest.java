/*  PokerTH automated tests.
	Copyright (C) 2010 Lothar May

	This program is free software: you can redistribute it and/or modify
	it under the terms of the GNU Affero General Public License as
	published by the Free Software Foundation, either version 3 of the
	License, or (at your option) any later version.

	This program is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU Affero General Public License for more details.

	You should have received a copy of the GNU Affero General Public License
	along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package pokerth_test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import pokerth_protocol.*;
import pokerth_protocol.AnnounceMessage.AnnounceMessageSequenceType.ServerTypeEnumType;
import pokerth_protocol.InitMessage.*;
import pokerth_protocol.InitMessage.InitMessageSequenceType.LoginChoiceType;

public class GuestLoginTest extends TestBase {

	@Test
	public void testInitMessage() throws Exception {
		guestInit();
	}
}
