.class public final LF90$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnc0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF90;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
.end annotation


# instance fields
.field public final synthetic a:LF90;


# direct methods
.method public constructor <init>(LF90;)V
    .locals 0

    iput-object p1, p0, LF90$e;->a:LF90;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, LF90$e;->a:LF90;

    iget-object v0, v0, LF90;->f:LF90$g;

    sget-object v1, LF90$g;->e:LF90$g;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LF90$e;->a:LF90;

    invoke-virtual {v0}, LF90;->d0()V

    :cond_0
    return-void
.end method
