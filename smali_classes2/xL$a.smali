.class public final LxL$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LxL;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LxL;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LxL;

    invoke-direct {v0}, LxL;-><init>()V

    sput-object v0, LxL$a;->a:LxL;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a()LxL;
    .locals 1

    sget-object v0, LxL$a;->a:LxL;

    return-object v0
.end method
