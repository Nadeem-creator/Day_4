/**
 * @author Nadeem
 *
 * 
 */

package com.main;

import java.util.Scanner;

import com.model.MembershipCard;
import com.model.PaybackCard;

public class MainApp3 {

	public static void main(String[] args) {

		MembershipCard mCard;
		PaybackCard pbCard;

		System.out.println("Enter the number of below cards");
		System.out.println("1.Payback Card   2.Membership Card");
		Scanner in = new Scanner(System.in);
		int userIn = in.nextInt();

		if (userIn == 1) {

			System.out.println("Enter card holder name details:");
			String uHolderName = in.next();

			System.out.println("Enter card number :");
			String uCardNumber = in.next();

			System.out.println("Enter expiry date : ");
			String uExpiryDate = in.next();

			System.out.println("Enter points :");
			int uPointsEarned = in.nextInt();

			System.out.println("Enter Amount : ");
			double uTotalAmount = in.nextDouble();

			pbCard = new PaybackCard(uHolderName, uCardNumber, uExpiryDate, uPointsEarned, uTotalAmount);
			System.out.println(pbCard.getHolderName());
			System.out.println(pbCard.getCardNumber());
			System.out.println(pbCard.getPointsEarned());
			System.out.println(pbCard.getTotalAmount());
		} else if (userIn == 2) {

			System.out.println("Enter card holder name details:");
			String uHolderName = in.next();

			System.out.println("Enter card number :");
			String uCardNumber = in.next();

			System.out.println("Enter expiry date : ");
			String uExpiryDate = in.next();

			System.out.println("Enter rating :");
			int uRating = in.nextInt();

			mCard = new MembershipCard(uHolderName, uCardNumber, uExpiryDate, uRating);
			System.out.println(mCard.getHolderName());
			System.out.println(mCard.getCardNumber());
			System.out.println(mCard.getExpiryDate());
			System.out.println(mCard.getRating());
		}

		in.close();
		//
		pbCard = null;
		mCard = null;
	}

}
