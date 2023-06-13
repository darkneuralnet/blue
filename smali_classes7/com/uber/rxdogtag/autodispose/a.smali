.class public final Lcom/uber/rxdogtag/autodispose/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/uber/autodispose/AutoDispose;

    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/uber/rxdogtag/autodispose/a;->a:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/uber/rxdogtag/M$a;)V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/uber/rxdogtag/E;

    const/4 v1, 0x0

    sget-object v2, Lcom/uber/rxdogtag/autodispose/b;->a:Lcom/uber/rxdogtag/autodispose/b;

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Lcom/uber/rxdogtag/M$a;->c([Lcom/uber/rxdogtag/E;)Lcom/uber/rxdogtag/M$a;

    move-result-object p0

    sget-object v0, Lcom/uber/rxdogtag/autodispose/a;->a:Ljava/util/Set;

    invoke-virtual {p0, v0}, Lcom/uber/rxdogtag/M$a;->a(Ljava/util/Collection;)Lcom/uber/rxdogtag/M$a;

    return-void
.end method
