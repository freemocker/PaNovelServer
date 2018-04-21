package cc.aoeiuv020.panovel.server.service

import cc.aoeiuv020.panovel.server.dal.model.autogen.Novel

/**
 *
 * Created by AoEiuV020 on 2018.04.05-09:13:02.
 */
interface NovelService {
    /**
     * 通知服务器这本小说有更新，
     *
     * @return 如果确实传入的记录比数据里的更新就返回true,
     */
    fun uploadUpdate(novel: Novel): Boolean

    /**
     * 需要更新的小说列表，
     * 就是最后检查过更新小说，
     *
     * @param count 返回小说数量，
     */
    fun needRefreshNovelList(count: Int): List<Novel>

    fun query(novel: Novel): Novel
}