.class final Lzendesk/messaging/DaggerMessagingActivityComponent$Builder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzendesk/messaging/MessagingActivityComponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/messaging/DaggerMessagingActivityComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private activity:Landroidx/appcompat/app/AppCompatActivity;

.field private messagingComponent:Lzendesk/messaging/MessagingComponent;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lzendesk/messaging/DaggerMessagingActivityComponent$1;)V
    .locals 0

    invoke-direct {p0}, Lzendesk/messaging/DaggerMessagingActivityComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public activity(Landroidx/appcompat/app/AppCompatActivity;)Lzendesk/messaging/DaggerMessagingActivityComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/app/AppCompatActivity;

    iput-object p1, p0, Lzendesk/messaging/DaggerMessagingActivityComponent$Builder;->activity:Landroidx/appcompat/app/AppCompatActivity;

    return-object p0
.end method

.method public bridge synthetic activity(Landroidx/appcompat/app/AppCompatActivity;)Lzendesk/messaging/MessagingActivityComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lzendesk/messaging/DaggerMessagingActivityComponent$Builder;->activity(Landroidx/appcompat/app/AppCompatActivity;)Lzendesk/messaging/DaggerMessagingActivityComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public build()Lzendesk/messaging/MessagingActivityComponent;
    .locals 4

    iget-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent$Builder;->activity:Landroidx/appcompat/app/AppCompatActivity;

    const-class v1, Landroidx/appcompat/app/AppCompatActivity;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent$Builder;->messagingComponent:Lzendesk/messaging/MessagingComponent;

    const-class v1, Lzendesk/messaging/MessagingComponent;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lzendesk/messaging/DaggerMessagingActivityComponent;

    iget-object v1, p0, Lzendesk/messaging/DaggerMessagingActivityComponent$Builder;->messagingComponent:Lzendesk/messaging/MessagingComponent;

    iget-object v2, p0, Lzendesk/messaging/DaggerMessagingActivityComponent$Builder;->activity:Landroidx/appcompat/app/AppCompatActivity;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lzendesk/messaging/DaggerMessagingActivityComponent;-><init>(Lzendesk/messaging/MessagingComponent;Landroidx/appcompat/app/AppCompatActivity;Lzendesk/messaging/DaggerMessagingActivityComponent$1;)V

    return-object v0
.end method

.method public messagingComponent(Lzendesk/messaging/MessagingComponent;)Lzendesk/messaging/DaggerMessagingActivityComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzendesk/messaging/MessagingComponent;

    iput-object p1, p0, Lzendesk/messaging/DaggerMessagingActivityComponent$Builder;->messagingComponent:Lzendesk/messaging/MessagingComponent;

    return-object p0
.end method

.method public bridge synthetic messagingComponent(Lzendesk/messaging/MessagingComponent;)Lzendesk/messaging/MessagingActivityComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lzendesk/messaging/DaggerMessagingActivityComponent$Builder;->messagingComponent(Lzendesk/messaging/MessagingComponent;)Lzendesk/messaging/DaggerMessagingActivityComponent$Builder;

    move-result-object p1

    return-object p1
.end method
