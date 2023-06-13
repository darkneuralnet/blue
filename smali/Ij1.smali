.class public LIj1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LIj1$b;
    }
.end annotation


# static fields
.field public static final a:LIj1;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LBt;

    sget-object v1, Lzb4;->g:Lzb4;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LBt;-><init>(Lzb4;I)V

    sput-object v0, LIj1;->a:LIj1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LIj1$a;)V
    .locals 0

    invoke-direct {p0}, LIj1;-><init>()V

    return-void
.end method

.method public static a(Lzb4;)LIj1;
    .locals 2

    new-instance v0, LBt;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, LBt;-><init>(Lzb4;I)V

    return-object v0
.end method

.method public static b(Lzb4;)LIj1;
    .locals 2

    new-instance v0, LBt;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, LBt;-><init>(Lzb4;I)V

    return-object v0
.end method
