.class public final LJO8;
.super LzO8;
.source "SourceFile"


# static fields
.field public static final b:LJO8;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LJO8;

    invoke-direct {v0}, LJO8;-><init>()V

    sput-object v0, LJO8;->b:LJO8;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const-string v0, "CharMatcher.none()"

    invoke-direct {p0, v0}, LzO8;-><init>(Ljava/lang/String;)V

    return-void
.end method
