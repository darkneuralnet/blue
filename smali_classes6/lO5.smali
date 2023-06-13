.class public final LlO5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Z

.field public static final b:LTW0$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LTW0$b<",
            "+",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:LTW0$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LTW0$b<",
            "+",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:LCb6;

.field public static final e:LCb6;

.field public static final f:LCb6;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    :try_start_0
    const-string v0, "java.sql.Date"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, LlO5;->a:Z

    if-eqz v0, :cond_0

    new-instance v0, LlO5$a;

    const-class v1, Ljava/sql/Date;

    invoke-direct {v0, v1}, LlO5$a;-><init>(Ljava/lang/Class;)V

    sput-object v0, LlO5;->b:LTW0$b;

    new-instance v0, LlO5$b;

    const-class v1, Ljava/sql/Timestamp;

    invoke-direct {v0, v1}, LlO5$b;-><init>(Ljava/lang/Class;)V

    sput-object v0, LlO5;->c:LTW0$b;

    sget-object v0, Lcom/google/gson/internal/sql/SqlDateTypeAdapter;->b:LCb6;

    sput-object v0, LlO5;->d:LCb6;

    sget-object v0, Lcom/google/gson/internal/sql/SqlTimeTypeAdapter;->b:LCb6;

    sput-object v0, LlO5;->e:LCb6;

    sget-object v0, Lcom/google/gson/internal/sql/SqlTimestampTypeAdapter;->b:LCb6;

    sput-object v0, LlO5;->f:LCb6;

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    sput-object v0, LlO5;->b:LTW0$b;

    sput-object v0, LlO5;->c:LTW0$b;

    sput-object v0, LlO5;->d:LCb6;

    sput-object v0, LlO5;->e:LCb6;

    sput-object v0, LlO5;->f:LCb6;

    :goto_1
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
