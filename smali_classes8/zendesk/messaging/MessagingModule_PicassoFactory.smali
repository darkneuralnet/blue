.class public final Lzendesk/messaging/MessagingModule_PicassoFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LiT3;",
        ">;"
    }
.end annotation


# instance fields
.field private final contextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/MessagingModule_PicassoFactory;->contextProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lzendesk/messaging/MessagingModule_PicassoFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;)",
            "Lzendesk/messaging/MessagingModule_PicassoFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/messaging/MessagingModule_PicassoFactory;

    invoke-direct {v0, p0}, Lzendesk/messaging/MessagingModule_PicassoFactory;-><init>(LY94;)V

    return-object v0
.end method

.method public static picasso(Landroid/content/Context;)LiT3;
    .locals 0

    invoke-static {p0}, Lzendesk/messaging/MessagingModule;->picasso(Landroid/content/Context;)LiT3;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LiT3;

    return-object p0
.end method


# virtual methods
.method public get()LiT3;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/MessagingModule_PicassoFactory;->contextProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lzendesk/messaging/MessagingModule_PicassoFactory;->picasso(Landroid/content/Context;)LiT3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/messaging/MessagingModule_PicassoFactory;->get()LiT3;

    move-result-object v0

    return-object v0
.end method
