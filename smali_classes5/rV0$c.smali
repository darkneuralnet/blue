.class public final LrV0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LsV0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LrV0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LsV0$a<",
        "TZ;>;"
    }
.end annotation


# instance fields
.field public final a:LZS0;

.field public final synthetic b:LrV0;


# direct methods
.method public constructor <init>(LrV0;LZS0;)V
    .locals 0

    iput-object p1, p0, LrV0$c;->b:LrV0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LrV0$c;->a:LZS0;

    return-void
.end method


# virtual methods
.method public a(LVL4;)LVL4;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVL4<",
            "TZ;>;)",
            "LVL4<",
            "TZ;>;"
        }
    .end annotation

    iget-object v0, p0, LrV0$c;->b:LrV0;

    iget-object v1, p0, LrV0$c;->a:LZS0;

    invoke-virtual {v0, v1, p1}, LrV0;->v(LZS0;LVL4;)LVL4;

    move-result-object p1

    return-object p1
.end method
