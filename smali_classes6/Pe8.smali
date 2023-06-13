.class public final synthetic LPe8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUs0;


# static fields
.field public static final synthetic a:LPe8;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LPe8;

    invoke-direct {v0}, LPe8;-><init>()V

    sput-object v0, LPe8;->a:LPe8;

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

    new-instance v0, LHC7;

    const-class v1, LyU2;

    invoke-interface {p1, v1}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LyU2;

    invoke-direct {v0, p1}, LHC7;-><init>(LyU2;)V

    return-object v0
.end method
