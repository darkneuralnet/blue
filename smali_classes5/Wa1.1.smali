.class public final LWa1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lak2;


# static fields
.field public static final b:LWa1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LWa1;

    invoke-direct {v0}, LWa1;-><init>()V

    sput-object v0, LWa1;->b:LWa1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()LWa1;
    .locals 1

    sget-object v0, LWa1;->b:LWa1;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/security/MessageDigest;)V
    .locals 0

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EmptySignature"

    return-object v0
.end method
