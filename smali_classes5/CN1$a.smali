.class public LCN1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXU2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCN1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LXU2<",
        "LOC1;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LSU2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LSU2<",
            "LOC1;",
            "LOC1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LSU2;

    const-wide/16 v1, 0x1f4

    invoke-direct {v0, v1, v2}, LSU2;-><init>(J)V

    iput-object v0, p0, LCN1$a;->a:LSU2;

    return-void
.end method


# virtual methods
.method public b(LQW2;)LWU2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQW2;",
            ")",
            "LWU2<",
            "LOC1;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    new-instance p1, LCN1;

    iget-object v0, p0, LCN1$a;->a:LSU2;

    invoke-direct {p1, v0}, LCN1;-><init>(LSU2;)V

    return-object p1
.end method
