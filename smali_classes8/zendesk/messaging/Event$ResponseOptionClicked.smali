.class public Lzendesk/messaging/Event$ResponseOptionClicked;
.super Lzendesk/messaging/Event;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/messaging/Event;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ResponseOptionClicked"
.end annotation


# instance fields
.field private final clickedOption:Lzendesk/messaging/MessagingItem$Option;

.field private final optionsResponse:Lzendesk/messaging/MessagingItem$OptionsResponse;


# direct methods
.method public constructor <init>(Lzendesk/messaging/MessagingItem$OptionsResponse;Lzendesk/messaging/MessagingItem$Option;Ljava/util/Date;)V
    .locals 1

    const-string v0, "response_option_clicked"

    invoke-direct {p0, v0, p3}, Lzendesk/messaging/Event;-><init>(Ljava/lang/String;Ljava/util/Date;)V

    iput-object p1, p0, Lzendesk/messaging/Event$ResponseOptionClicked;->optionsResponse:Lzendesk/messaging/MessagingItem$OptionsResponse;

    iput-object p2, p0, Lzendesk/messaging/Event$ResponseOptionClicked;->clickedOption:Lzendesk/messaging/MessagingItem$Option;

    return-void
.end method
