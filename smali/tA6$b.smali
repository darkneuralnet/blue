.class public LtA6$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LtA6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:LzA6;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, LtA6;->a()LzA6;

    move-result-object v0

    sput-object v0, LtA6$b;->a:LzA6;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
