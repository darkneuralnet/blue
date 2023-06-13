.class public final LIt8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LQ68;

.field public static volatile b:LQ68;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LJm8;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LJm8;-><init>(LXe8;)V

    sput-object v0, LIt8;->a:LQ68;

    sput-object v0, LIt8;->b:LQ68;

    return-void
.end method

.method public static a()LQ68;
    .locals 1

    sget-object v0, LIt8;->b:LQ68;

    return-object v0
.end method
