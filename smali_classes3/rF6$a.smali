.class public final LrF6$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LrF6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LrF6;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LrF6;

    invoke-direct {v0}, LrF6;-><init>()V

    sput-object v0, LrF6$a;->a:LrF6;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a()LrF6;
    .locals 1

    sget-object v0, LrF6$a;->a:LrF6;

    return-object v0
.end method
