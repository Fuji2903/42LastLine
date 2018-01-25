package com.lastline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.lastline.list.LimitLinkedList;

public class ReadFile {

	public static LimitLinkedList<String> getlastLineFromFile(String filePath, int limit) {
		LimitLinkedList<String> limitLinkedList = new LimitLinkedList<>(limit);
		try {
			File f = new File(filePath);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			try {
				String line = br.readLine();
				while (line != null) {
					line = br.readLine();
					if (line != null)
						limitLinkedList.push(line);
				}

				br.close();
				fr.close();
			} catch (IOException exception) {
				System.out.println("Erreur lors de la lecture : " + exception.getMessage());
			}
		} catch (FileNotFoundException exception) {
			System.out.println("Le fichier n'a pas été trouvé");
		}
		return limitLinkedList;
	}

}
