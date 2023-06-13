.class public final synthetic LEN8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic a:LOq9;


# direct methods
.method public synthetic constructor <init>(LOq9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEN8;->a:LOq9;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 1

    iget-object v0, p0, LEN8;->a:LOq9;

    invoke-static {v0}, LOq9;->h(LOq9;)V

    return-void
.end method
