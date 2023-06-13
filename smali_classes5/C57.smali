.class public final LC57;
.super LB57;
.source "SourceFile"


# static fields
.field public static final b:LC57;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LC57;

    invoke-direct {v0}, LC57;-><init>()V

    sput-object v0, LC57;->b:LC57;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const-string v0, "CharMatcher.none()"

    invoke-direct {p0, v0}, LB57;-><init>(Ljava/lang/String;)V

    return-void
.end method
