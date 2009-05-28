package com.brasee.games.chess.web.commands;

import javax.servlet.http.HttpServletRequest;

public class ChessCommandFactory {

	public static ChessCommand createCommand(HttpServletRequest request) {
		ChessCommand chessCommand = new InvalidCommand();
		
		String commandName = request.getParameter("command");
		
		if ("retrieve_game".equals(commandName)) {
			chessCommand = new RetrieveGameCommand();
		}
		else if ("reset_game".equals(commandName)) {
			chessCommand = new ResetGameCommand();
		}
		else if ("move".equals(commandName)) {
			chessCommand = new MoveCommand();
		}
		else if ("promote".equals(commandName)) {
			chessCommand = new PromoteCommand();
		}

		return chessCommand;
	}
}
