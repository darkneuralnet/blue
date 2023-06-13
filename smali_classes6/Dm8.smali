.class public final synthetic LDm8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhs9;


# static fields
.field public static final synthetic a:LDm8;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LDm8;

    invoke-direct {v0}, LDm8;-><init>()V

    sput-object v0, LDm8;->a:LDm8;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lp06$e;

    invoke-virtual {p1}, Lp06$e;->e()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
