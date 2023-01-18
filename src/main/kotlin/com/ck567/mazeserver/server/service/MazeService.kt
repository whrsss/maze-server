package com.ck567.mazeserver.server.service

import com.ck567.mazeserver.server.controller.InitReq
import com.ck567.mazeserver.server.controller.MoveReq
import com.ck567.mazeserver.server.entity.Walker
import com.ck567.mazeserver.server.entity.Maze
import org.springframework.stereotype.Service

@Service
class MazeService {

    var userMaze: HashMap<String, Walker> = HashMap()

    fun init(req: InitReq): Walker {
        var maze = Maze(req.width, req.height)
        maze.walk(2)
        println(maze.grids.contentToString())
        var walker = Walker(maze)
        userMaze[req.userId] = walker
        return walker
    }
    fun move(req: MoveReq): Walker {
        val walker = userMaze[req.userId]
        walker!!.move(req.direction)
        return walker
    }
}