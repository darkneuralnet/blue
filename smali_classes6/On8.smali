.class public final LOn8;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "LNp9;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final a:LOn8;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LOn8;

    invoke-direct {v0}, LOn8;-><init>()V

    sput-object v0, LOn8;->a:LOn8;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LOn8;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "LNp9;",
            ">()",
            "LOn8<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, LOn8;->a:LOn8;

    return-object v0
.end method
