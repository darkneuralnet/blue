.class public interface abstract LJH1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LJH1;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final b:LJH1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LJH1$a;

    invoke-direct {v0}, LJH1$a;-><init>()V

    sput-object v0, LJH1;->a:LJH1;

    new-instance v0, LJn2$a;

    invoke-direct {v0}, LJn2$a;-><init>()V

    invoke-virtual {v0}, LJn2$a;->a()LJn2;

    move-result-object v0

    sput-object v0, LJH1;->b:LJH1;

    return-void
.end method


# virtual methods
.method public abstract getHeaders()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method
