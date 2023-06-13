.class public final synthetic Lbf7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUs0;


# static fields
.field public static final synthetic a:Lbf7;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lbf7;

    invoke-direct {v0}, Lbf7;-><init>()V

    sput-object v0, Lbf7;->a:Lbf7;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LOs0;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LTU2;

    const-class v1, LyU2;

    invoke-interface {p1, v1}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LyU2;

    invoke-direct {v0, p1}, LTU2;-><init>(LyU2;)V

    return-object v0
.end method
