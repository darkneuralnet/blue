.class public final synthetic LlK6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final a:LzK6;


# direct methods
.method public constructor <init>(LzK6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LlK6;->a:LzK6;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 1

    iget-object v0, p0, LlK6;->a:LzK6;

    invoke-virtual {v0}, LzK6;->n()V

    return-void
.end method
