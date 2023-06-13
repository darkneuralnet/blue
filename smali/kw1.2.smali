.class public abstract Lkw1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkw1$a;,
        Lkw1$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u000c2\u00020\u0001:\u0002\r\u0003B\u0011\u0008\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u001d\u0010\t\u001a\u00020\u00028G\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u0004\u0012\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0003\u000e\u000f\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lkw1;",
        "",
        "",
        "b",
        "Z",
        "getCanLoadSynchronously",
        "()Z",
        "getCanLoadSynchronously$annotations",
        "()V",
        "canLoadSynchronously",
        "<init>",
        "(Z)V",
        "c",
        "a",
        "Lfl1;",
        "Lqt2;",
        "LUX5;",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final c:Lkw1$a;

.field public static final d:LUX5;

.field public static final e:LtB1;

.field public static final f:LtB1;

.field public static final g:LtB1;

.field public static final h:LtB1;


# instance fields
.field public final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkw1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkw1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkw1;->c:Lkw1$a;

    new-instance v0, LmX0;

    invoke-direct {v0}, LmX0;-><init>()V

    sput-object v0, Lkw1;->d:LUX5;

    new-instance v0, LtB1;

    const-string v1, "sans-serif"

    const-string v2, "FontFamily.SansSerif"

    invoke-direct {v0, v1, v2}, LtB1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lkw1;->e:LtB1;

    new-instance v0, LtB1;

    const-string v1, "serif"

    const-string v2, "FontFamily.Serif"

    invoke-direct {v0, v1, v2}, LtB1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lkw1;->f:LtB1;

    new-instance v0, LtB1;

    const-string v1, "monospace"

    const-string v2, "FontFamily.Monospace"

    invoke-direct {v0, v1, v2}, LtB1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lkw1;->g:LtB1;

    new-instance v0, LtB1;

    const-string v1, "cursive"

    const-string v2, "FontFamily.Cursive"

    invoke-direct {v0, v1, v2}, LtB1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lkw1;->h:LtB1;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lkw1;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lkw1;-><init>(Z)V

    return-void
.end method

.method public static final synthetic a()LUX5;
    .locals 1

    sget-object v0, Lkw1;->d:LUX5;

    return-object v0
.end method
