.class public final synthetic LYo8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk69;


# instance fields
.field public final synthetic a:Lqq8;


# direct methods
.method public synthetic constructor <init>(Lqq8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYo8;->a:Lqq8;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)LMb9;
    .locals 1

    iget-object v0, p0, LYo8;->a:Lqq8;

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {v0, p1}, Lqq8;->i(Landroid/net/Uri;)LMb9;

    move-result-object p1

    return-object p1
.end method
