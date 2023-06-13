.class public LyW3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUh;


# static fields
.field public static final a:LyW3;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LyW3;

    invoke-direct {v0}, LyW3;-><init>()V

    sput-object v0, LyW3;->a:LyW3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()LyW3;
    .locals 1

    sget-object v0, LyW3;->a:LyW3;

    return-object v0
.end method


# virtual methods
.method public a(LAm1;)LTh;
    .locals 1

    const-class v0, LxW3;

    invoke-virtual {p1, v0}, LAm1;->i(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LTh;

    return-object p1
.end method
