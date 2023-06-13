.class public final LyS1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LyS1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LyS1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LyS1;

    invoke-direct {v0}, LyS1;-><init>()V

    sput-object v0, LyS1$a;->a:LyS1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a()LyS1;
    .locals 1

    sget-object v0, LyS1$a;->a:LyS1;

    return-object v0
.end method
