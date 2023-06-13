.class public final LRi$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LRi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LRi;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LRi;

    invoke-direct {v0}, LRi;-><init>()V

    sput-object v0, LRi$a;->a:LRi;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a()LRi;
    .locals 1

    sget-object v0, LRi$a;->a:LRi;

    return-object v0
.end method
