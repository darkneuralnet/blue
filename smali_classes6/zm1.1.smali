.class public final synthetic Lzm1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAm1$a;


# instance fields
.field public final synthetic a:LAm1;


# direct methods
.method public synthetic constructor <init>(LAm1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzm1;->a:LAm1;

    return-void
.end method


# virtual methods
.method public final onBackgroundStateChanged(Z)V
    .locals 1

    iget-object v0, p0, Lzm1;->a:LAm1;

    invoke-static {v0, p1}, LAm1;->a(LAm1;Z)V

    return-void
.end method
