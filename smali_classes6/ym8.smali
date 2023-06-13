.class public final Lym8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LyU2;

.field public final b:Lgg9;


# direct methods
.method public constructor <init>(LyU2;)V
    .locals 1

    const-string v0, "common"

    invoke-static {v0}, Lni9;->b(Ljava/lang/String;)Lgg9;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lym8;->a:LyU2;

    iput-object v0, p0, Lym8;->b:Lgg9;

    return-void
.end method
