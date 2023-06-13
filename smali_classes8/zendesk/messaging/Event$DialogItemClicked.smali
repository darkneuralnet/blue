.class public Lzendesk/messaging/Event$DialogItemClicked;
.super Lzendesk/messaging/Event;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/messaging/Event;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DialogItemClicked"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/messaging/Event$DialogItemClicked$Builder;
    }
.end annotation


# instance fields
.field private final config:Lzendesk/messaging/DialogContent$Config;

.field private final isPositive:Z

.field private final payload:Ljava/lang/String;

.field private final previousConfig:Lzendesk/messaging/DialogContent$Config;


# direct methods
.method private constructor <init>(Ljava/util/Date;Lzendesk/messaging/DialogContent$Config;ZLjava/lang/String;Lzendesk/messaging/DialogContent$Config;)V
    .locals 1

    const-string v0, "dialog_item_clicked"

    invoke-direct {p0, v0, p1}, Lzendesk/messaging/Event;-><init>(Ljava/lang/String;Ljava/util/Date;)V

    iput-object p2, p0, Lzendesk/messaging/Event$DialogItemClicked;->config:Lzendesk/messaging/DialogContent$Config;

    iput-boolean p3, p0, Lzendesk/messaging/Event$DialogItemClicked;->isPositive:Z

    iput-object p4, p0, Lzendesk/messaging/Event$DialogItemClicked;->payload:Ljava/lang/String;

    iput-object p5, p0, Lzendesk/messaging/Event$DialogItemClicked;->previousConfig:Lzendesk/messaging/DialogContent$Config;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Date;Lzendesk/messaging/DialogContent$Config;ZLjava/lang/String;Lzendesk/messaging/DialogContent$Config;Lzendesk/messaging/Event$1;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lzendesk/messaging/Event$DialogItemClicked;-><init>(Ljava/util/Date;Lzendesk/messaging/DialogContent$Config;ZLjava/lang/String;Lzendesk/messaging/DialogContent$Config;)V

    return-void
.end method
