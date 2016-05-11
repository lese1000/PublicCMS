package com.publiccms.entities.plugin;

// Generated 2016-3-1 16:21:35 by Hibernate Tools 4.3.1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sanluan.common.source.entity.MyColumn;

/**
 * PluginLotteryUser generated by hbm2java
 */
@Entity
@Table(name = "plugin_lottery_user")
public class PluginLotteryUser implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @MyColumn(title = "ID")
    private Integer id;
    @MyColumn(title = "抽奖", condition = true)
    private int lotteryId;
    @MyColumn(title = "用户", condition = true)
    private int userId;
    @MyColumn(title = "是否中奖", condition = true)
    private boolean winning;
    @MyColumn(title = "IP")
    private String ip;
    @MyColumn(title = "抽奖时间", condition = true, order = true)
    private Date createDate;

    public PluginLotteryUser() {
    }

    public PluginLotteryUser(int lotteryId, int userId, boolean winning, String ip, Date createDate) {
        this.lotteryId = lotteryId;
        this.userId = userId;
        this.winning = winning;
        this.ip = ip;
        this.createDate = createDate;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "lottery_id", nullable = false)
    public int getLotteryId() {
        return this.lotteryId;
    }

    public void setLotteryId(int lotteryId) {
        this.lotteryId = lotteryId;
    }

    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "winning", nullable = false)
    public boolean isWinning() {
        return this.winning;
    }

    public void setWinning(boolean winning) {
        this.winning = winning;
    }

    @Column(name = "ip", nullable = false, length = 64)
    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false, length = 19)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}