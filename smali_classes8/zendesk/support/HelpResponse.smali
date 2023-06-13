.class Lzendesk/support/HelpResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private categories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzendesk/support/CategoryItem;",
            ">;"
        }
    .end annotation
.end field

.field private categoryCount:I
    .annotation runtime Lft5;
        value = "category_count"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCategories()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lzendesk/support/CategoryItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/HelpResponse;->categories:Ljava/util/List;

    invoke-static {v0}, Ljm0;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getCategoryCount()I
    .locals 1

    iget v0, p0, Lzendesk/support/HelpResponse;->categoryCount:I

    return v0
.end method
