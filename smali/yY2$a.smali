.class public final LyY2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LyY2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0005\u001a\u00020\u0000\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003J\u0006\u0010\u0007\u001a\u00020\u0006R \u0010\u0004\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\n\u00a8\u0006\u0013"
    }
    d2 = {
        "LyY2$a;",
        "",
        "T",
        "LWY2;",
        "type",
        "b",
        "LyY2;",
        "a",
        "LWY2;",
        "",
        "Z",
        "isNullable",
        "c",
        "Ljava/lang/Object;",
        "defaultValue",
        "d",
        "defaultValuePresent",
        "<init>",
        "()V",
        "navigation-common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public a:LWY2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWY2<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public b:Z

.field public c:Ljava/lang/Object;

.field public d:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LyY2;
    .locals 5

    iget-object v0, p0, LyY2$a;->a:LWY2;

    if-nez v0, :cond_0

    sget-object v0, LWY2;->c:LWY2$l;

    iget-object v1, p0, LyY2$a;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1}, LWY2$l;->a(Ljava/lang/Object;)LWY2;

    move-result-object v0

    :cond_0
    new-instance v1, LyY2;

    iget-boolean v2, p0, LyY2$a;->b:Z

    iget-object v3, p0, LyY2$a;->c:Ljava/lang/Object;

    iget-boolean v4, p0, LyY2$a;->d:Z

    invoke-direct {v1, v0, v2, v3, v4}, LyY2;-><init>(LWY2;ZLjava/lang/Object;Z)V

    return-object v1
.end method

.method public final b(LWY2;)LyY2$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LWY2<",
            "TT;>;)",
            "LyY2$a;"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LyY2$a;->a:LWY2;

    return-object p0
.end method
